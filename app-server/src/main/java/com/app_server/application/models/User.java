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
public class User {
    @Id
    private int ref;
    private int age;
    private String name;
    private String password;
    private String email;
    private String description;
    private String photo;

    @OneToMany(mappedBy = "user")
    private List<Recipe> recipeList;
    @OneToMany(mappedBy = "user")
    private List<Favorite> favoriteList;
    @OneToMany(mappedBy = "user")
    private List<Reaction> reactionList;
}
