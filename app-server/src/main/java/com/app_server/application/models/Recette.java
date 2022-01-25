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

    @ManyToOne()
    private Utilisateur utilisateur;
    @ManyToOne()
    private Categorie categorie;

    @OneToMany(mappedBy = "recette")
    private List<Image> imageList;
    @OneToMany(mappedBy = "recette")
    private List<Reaction> reactionList;
    @OneToMany(mappedBy = "recette")
    private List<Contient> contientList;
    @OneToMany(mappedBy = "recette")
    private List<Favori> favoriList;

}