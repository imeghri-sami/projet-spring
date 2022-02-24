package com.app_server.application.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

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
    private Date date;
    private String video;
    private double time;

    @ManyToOne
    @JsonBackReference
    private User user;
    @ManyToOne
    @JsonBackReference
    private Category category;

    @OneToMany(mappedBy = "recipe")
    @JsonManagedReference
    private List<Image> imageList;
    @OneToMany(mappedBy = "recipe")
    @JsonManagedReference
    private List<Reaction> reactionList;
    @OneToMany(mappedBy = "recipe")
    @JsonManagedReference
    private List<Content> contentList;
    @OneToMany(mappedBy = "recipe")
    @JsonManagedReference
    private List<Favorite> favoriteList;

    public float getPrice(){
        float total=0;
        for (Content content :
                contentList) {
            total+= content.getIngredient().getPrice()*content.getIngredientQuantity();
        }
        return total;
    }

}