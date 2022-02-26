package com.app_server.application.controllers;


import lombok.AllArgsConstructor;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

@RestController
@RequestMapping("/images")
@AllArgsConstructor
public class ImageEndPoint {

    @GetMapping(value = "/{id}", produces = MediaType.IMAGE_JPEG_VALUE)
    //@PreAuthorize("hasAnyAuthority('PRIVILEGE0', 'PRIVILEGE1', 'PRIVILEGE2')")
    public ResponseEntity<?> getImageByItsHash(@PathVariable String id, @RequestParam(required = false) String fileName) {
        File found = searchByName(id);

        ByteArrayResource inputStream = null;
        try {
            inputStream = new ByteArrayResource(Files.readAllBytes(found.toPath()));
        } catch (IOException e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal server error " + e.getMessage());
        }

        return ResponseEntity
                .status(HttpStatus.OK)
                .header("Content-Type", "image/jpeg;")
                .contentLength(inputStream.contentLength())
                .body(inputStream);

    }

    public File searchByName(String name) {
        File directory = Paths.get("app-server/src/images").toAbsolutePath().toFile();
        return Arrays
                .stream(directory.listFiles())
                .filter(f -> f.getName().equals(name))
                .findFirst().orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        String.format("Attachement %s not found", name)
                ));
    }

}