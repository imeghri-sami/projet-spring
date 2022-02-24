package com.app_server.application.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TypeReact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ref;
    private String img;
    private String label;


    @OneToMany(mappedBy = "typeReact")
    @JsonManagedReference
    private List<Reaction> reactionList;
}
