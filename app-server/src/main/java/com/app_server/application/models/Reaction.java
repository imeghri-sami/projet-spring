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
    private int ref;

    @ManyToOne()
    private Recipe recipe;
    @ManyToOne()
    private User user;
    @ManyToOne()
    private TypeReact typeReact;
}
