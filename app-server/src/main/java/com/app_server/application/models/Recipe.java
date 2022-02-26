package com.app_server.application.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
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
    private String video;


    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date lastModifiedAt;

    private double time;

    @ManyToOne
    @JsonBackReference(value = "user-recipe")
    private User user;

    @ManyToOne
    @JsonBackReference(value = "category-recipe")
    private Category category;

    @OneToMany(mappedBy = "recipe")
    @JsonManagedReference(value = "image-recipe")
    private List<Image> imageList;

    @OneToMany(mappedBy = "recipe")
    @JsonManagedReference(value="reaction-recipe")
    private List<Reaction> reactionList;

    @OneToMany(mappedBy = "recipe")
    @JsonManagedReference(value = "content-recipe")
    private List<Content> contentList;

    @OneToMany(mappedBy = "recipe")
    @JsonManagedReference(value = "favorite-recipe")
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