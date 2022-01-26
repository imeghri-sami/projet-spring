package com.app_server.application.models;

import lombok.*;

import javax.persistence.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ref;
    private String img;
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Recipe> recipeList;

}
