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

    @ManyToOne(targetEntity = Recette.class)
    private int ref_recette_reaction;
    @ManyToOne(targetEntity = Utilisateur.class)
    private int ref_user_reaction;
    @ManyToOne(targetEntity = TypeReact.class)
    private int ref_react_reaction;
}
