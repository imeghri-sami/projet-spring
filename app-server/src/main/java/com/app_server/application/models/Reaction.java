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
public class Reaction {
    @Id
    private int refReaction;

    @ManyToOne()
    private Recette recette;
    @ManyToOne()
    private Utilisateur utilisateur;
    @ManyToOne()
    private TypeReact typeReact;
}
