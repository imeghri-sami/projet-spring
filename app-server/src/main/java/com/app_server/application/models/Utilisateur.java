package com.app_server.application.models;

import lombok.*;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Utilisateur {
    @Id
    private int refUser;
    private int ageUser;
    private String nomUser;
    private String prenomUser;
    private String passUser;
    private String emailUser;
    private String descUser;
    private String photoUser;

    @OneToMany(mappedBy = "utilisateur")
    private List<Recette> recetteList;
    @OneToMany(mappedBy = "utilisateur")
    private List<Favori> favoriList;
    @OneToMany(mappedBy = "utilisateur")
    private List<Reaction> reactionList;
}
