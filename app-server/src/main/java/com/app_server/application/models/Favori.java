package com.app_server.application.models;

import lombok.*;
import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Favori {

    @Id
    private int refFav;
    private Date dateFav;

    @ManyToOne()
    private Recette recette;
    @ManyToOne()
    private Utilisateur utilisateur;
}
