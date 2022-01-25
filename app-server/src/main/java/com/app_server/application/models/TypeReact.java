package com.app_server.application.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TypeReact {

    @Id
    private int ref;
    private String img;
    private String label;


    @OneToMany(mappedBy = "typeReact")
    private List<Reaction> reactionList;
}
