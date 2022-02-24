package com.app_server.application.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Content {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ref;
    private double ingredientQuantity;

    @ManyToOne
    @JsonBackReference(value = "content-recipe")
    private Recipe recipe;
    @ManyToOne
    @JsonBackReference(value = "content-ingredient")
    private Ingredient ingredient;
}
