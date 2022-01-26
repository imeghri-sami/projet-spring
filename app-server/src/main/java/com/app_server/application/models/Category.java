package com.app_server.application.models;

import lombok.*;
import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    @Id
    private int ref;
    private String img;
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Recipe> recipeList;

}
