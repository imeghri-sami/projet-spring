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
    @JsonBackReference
    private Recipe recipe;
    @ManyToOne
    @JsonBackReference
    private Ingredient ingredient;
}
