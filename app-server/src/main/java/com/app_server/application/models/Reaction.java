package com.app_server.application.models;

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
    private Recipe recipe;
    @ManyToOne
    private User user;
    @ManyToOne
    private TypeReact typeReact;
}
