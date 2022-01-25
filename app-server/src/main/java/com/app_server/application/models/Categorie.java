package com.app_server.application.models;

import lombok.*;
import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Categorie {

    @Id
    private int refCateg;
    private String imgCateg;
    private String nomCateg;

    @OneToMany(mappedBy = "categorie")
    private List<Recette> recetteList;

}
