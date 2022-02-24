package com.app_server.application.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ref;

    @ManyToOne
    @JsonBackReference(value="reaction-recipe")
    private Recipe recipe;
    @ManyToOne
    @JsonBackReference(value="reaction-user")
    private User user;
    @ManyToOne
    @JsonBackReference(value="reaction-typeReact")
    private TypeReact typeReact;
}
