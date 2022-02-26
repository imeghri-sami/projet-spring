package com.app_server.application.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ref;
    private int age;
    private String name;
    //Excluding password property from the json response
    @JsonIgnore
    private String password;
    private String email;
    private String description;
    private String photo;

    @OneToMany(mappedBy = "user")
    @JsonManagedReference(value = "user-recipe")
    private List<Recipe> recipeList;

    @OneToMany(mappedBy = "user")
    @JsonManagedReference(value = "favorite-user")
    private List<Favorite> favoriteList;

    @OneToMany(mappedBy = "user")
    @JsonManagedReference(value="reaction-user")
    private List<Reaction> reactionList;

}
