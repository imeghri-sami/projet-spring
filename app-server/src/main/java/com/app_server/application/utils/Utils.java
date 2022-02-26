package com.app_server.application.utils;

import org.springframework.http.HttpStatus;
import org.springframework.util.Base64Utils;
import org.springframework.web.server.ResponseStatusException;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Utils {

    /**
     * Encode a string using SHA1 algorithm
     * @param    src the string to encode
     * @return       an encoded string
     * */
    public static String toSHA1(String src){
        MessageDigest md = null;

        try {
            md = MessageDigest.getInstance("SHA-1");
            md.update(src.getBytes(StandardCharsets.UTF_8));
            return new BigInteger(1, md.digest()).toString(16);

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }


        return null;
    }

    /**
     * check if the given string value is in a valid
     * uuid format and returns the valid {@link UUID} type.
     * @param    uuid                    the string value to validate
     * @throws   ResponseStatusException if the given string is invalid or null
     * @return                           an UUID type correspond the given string value
     * */
    public static UUID validateUuid(String uuid) {
        UUID validUuid;

        try{
            validUuid = UUID.fromString(uuid);
        }catch(IllegalArgumentException ex){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid uuid format");
        }
        return validUuid;
    }

    /**
     * create a directory
     * @param directoryName the name of the directory to create
     * @return              the created directory in {@link File} type
     * @throws IOException  if an I/O error occur
     */
    public static File mkdir(String directoryName) throws IOException {

        Path path = Paths.get(directoryName).toAbsolutePath().normalize();
        Files.createDirectories(path);

        return path.toFile();
    }

    /**
     * create a base URL from the given {@link URL}
     * @param url   the URL information including host, port and protocol
     * @return      a string represents the base url 'protocol://host:port'
     */
    public static String constructBaseURL(URL url){
        return url.getProtocol() + "://" + url.getHost() + ":" + url.getPort();
    }

    /**
     * convert the given byte array to the Base64 format
     * @param src   a array of bytes
     * @return      if the input is not null a base64 string is returned
     *              otherwise a null
     */
    public static String base64Encode(byte[] src){
        return src == null ? null : Base64Utils.encodeToString(src);
    }

    /**
     * Convert a given list of objects to a map of string, long values,
     * this function is useful when you want to convert a result of a SQL
     * query to a map where the key is a string value and the its value is the
     * resulting number from a count() function
     * @param data  a list of an array containing two objects
     * @return      a map of string as keys and long as values
     */
    public static Map<String, Long> convertListToMap(List<Object[]> data){
        Map<String, Long> typeCountMap = new HashMap<>();
        if(data != null && data.size() > 0){
            data.forEach(record ->
                    typeCountMap.put((String)record[0], (Long)record[1])
            );
        }
        return typeCountMap;
    }
}