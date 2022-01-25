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
public class Contient {

    @Id
    private int refContient;
    private double quantIngr;

    @ManyToOne()
    private Recette recette;
    @ManyToOne()
    private Ingredient ingredient;
}
