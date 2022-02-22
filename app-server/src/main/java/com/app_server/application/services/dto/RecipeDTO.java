package com.app_server.application.services.dto;


import com.app_server.application.models.Category;
import com.app_server.application.models.Image;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class RecipeDTO{

    private int ref;
    private String description;
    private String name;
    private Date date;
    private double time;
    private List<ImageDTO> imageDTOS;
    private String categoryName;
}
