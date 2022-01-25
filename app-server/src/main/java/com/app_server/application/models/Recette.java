package com.app_server.application.models;

import lombok.*;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Recette {
    @Id
    private int refRecette;
    private String descRecette;
    private String nomRecette;
    private Date dateRecette;
    private Date videoRecette;
    private double tempsRecette;

    @ManyToOne(targetEntity = Utilisateur.class)
    private int ref_user_recette;
    @ManyToOne(targetEntity = Categorie.class)
    private int ref_categ_recette;

    @OneToMany(targetEntity = Image.class,mappedBy = "")
    private List<Image> imageList;
    @OneToMany(targetEntity = Reaction.class)
    private List<Reaction> reactionList;
    @OneToMany(targetEntity = Contient.class)
    private List<Contient> contientList;
    @OneToMany(targetEntity = Favori.class)
    private List<Favori> favoriList;

}