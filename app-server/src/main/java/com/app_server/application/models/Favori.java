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

    @ManyToOne(targetEntity = Recette.class)
    private int ref_recette_fav;
    @ManyToOne(targetEntity = Utilisateur.class)
    private int ref_user_fav;
}
