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

    @ManyToOne(targetEntity = Recette.class)
    private int ref_recette_contient;
    @ManyToOne(targetEntity = Ingredient.class)
    private int ref_ingr_contient;
}
