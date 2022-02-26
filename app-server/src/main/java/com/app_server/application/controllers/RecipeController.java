package com.app_server.application.controllers;

import com.app_server.application.models.Category;
import com.app_server.application.models.Recipe;
import com.app_server.application.models.User;
import com.app_server.application.services.RecipeService;
import com.app_server.application.utils.Utils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;

@RestController
public class RecipeController {
    @Autowired
    private ModelMapper recipeDTOMapper;
    @Autowired
    private RecipeService recipeService;

    @GetMapping("/recipes/get")
    public List<Map<String,Object>> getAll(@RequestParam(name = "page",defaultValue = "0") int page,@RequestParam(name = "size",defaultValue = "10") int size ) {
        Map<String,Object> map =new HashMap<>();
         return recipeService.getAll(page,size)
                .stream()
                .map(this::recipeToMap).collect(Collectors.toList());
    }

    @PostMapping("/recipes/create")
    public Recipe addRecipe(@RequestParam MultipartFile file, HttpServletRequest request) throws IOException {
        //description,name,date=today,image,time
        if ( !file.getContentType().startsWith("image") )
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "unsupported file type");

        Recipe recipe=new Recipe();
        recipe.setDescription(request.getParameter("description"));
        recipe.setName(request.getParameter("name"));
        recipe.setTime(Double.parseDouble(request.getParameter("time")));
        recipe.setDate(new Date());
        User user=new User();
        Category category=new Category();
        category.setRef(Integer.parseInt(request.getParameter("categoryRef")));
        user.setRef(Integer.parseInt(request.getParameter("userRef")));
        recipe.setUser(user);

        String fileName = Utils.toSHA1(Objects.requireNonNull(file.getOriginalFilename()));
        URL requestURL = new URL(request.getRequestURL().toString());
        String baseURL = Utils.constructBaseURL(requestURL);
        recipe.setImage(baseURL + "/images/" + fileName);

        saveImg(file, fileName);
        return recipeService.addRecipe(recipe);
    }



    @GetMapping("/recipes/getAllBy")
    public List<Recipe> getAllRecettesBy(@RequestParam("page") int page,
                                         @RequestParam(name = "size",defaultValue = "10") int size,
                                         @RequestParam("by") String by,
                                         @RequestParam("order") String order){
        return recipeService.getAllRecettesBy(page,size,by,order);
    }

    @GetMapping("/recipe/get/{ref}")
    public Recipe getRecipe(@PathVariable int ref){
        return recipeService.getRecipe(ref);
    }

    @DeleteMapping("/recipe/delete/{ref}")
    public void deleteRecipe(@PathVariable int ref){ recipeService.deleteRecipe(ref);}


    private Map<String,Object> recipeToMap(Recipe recipe){
        Map<String,Object> map =new HashMap<>();
        map.put("ref",recipe.getRef());
        map.put("description",recipe.getDescription());
        map.put("name",recipe.getName());
        map.put("date",recipe.getDate());
        map.put("time",recipe.getTime());
        map.put("price",recipe.getPrice());
        map.put("image",recipe.getImage()==null?null:recipe.getImage());
        map.put("categoryName",recipe.getCategory().getName());

        return map;
    }

    public void saveImg(MultipartFile multipartFile, String hashedFileName) throws IOException {

        File file = new File( "app-server/src/images/" + hashedFileName);
        OutputStream outStream = new FileOutputStream(file);

        try{
            outStream.write(multipartFile.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        outStream.close();

    }
}
