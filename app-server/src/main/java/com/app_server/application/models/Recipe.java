package com.app_server.application.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.hibernate.annotations.Formula;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ref;
    private String description;
    private String name;
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date lastModifiedAt;
    private String video;
    private String image;
    private double time;

    @ManyToOne
    @JsonBackReference(value = "user-recipe")
    private User user;
    @ManyToOne
    @JsonBackReference(value = "category-recipe")
    private Category category;


    @OneToMany(mappedBy = "recipe")
    @JsonManagedReference(value="reaction-recipe")
    private List<Reaction> reactionList;
    @OneToMany(mappedBy = "recipe")
    @JsonManagedReference(value = "content-recipe")
    private List<Content> contentList;

    @OneToMany(mappedBy = "recipe")
    @JsonManagedReference(value = "favorite-recipe")
    private List<Favorite> favoriteList;

    @Formula("(select sum(i.price) from content c, ingredient i where c.ingredient_ref=i.ref and c.recipe_ref= ref)")
    private float price;

}