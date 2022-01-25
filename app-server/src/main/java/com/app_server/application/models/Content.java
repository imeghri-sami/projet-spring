package com.app_server.application.models;

import lombok.*;
import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Content {

    @Id
    private int ref;
    private double ingredientQuantity;

    @ManyToOne()
    private Recipe recipe;
    @ManyToOne()
    private Ingredient ingredient;
}
