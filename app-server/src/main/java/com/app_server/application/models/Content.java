package com.app_server.application.models;

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
    private Recipe recipe;
    @ManyToOne
    private Ingredient ingredient;
}
