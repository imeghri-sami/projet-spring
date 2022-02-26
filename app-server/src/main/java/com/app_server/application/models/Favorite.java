package com.app_server.application.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Favorite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ref;
    private Date date;

    @ManyToOne
    @JsonBackReference(value = "favorite-recipe")
    private Recipe recipe;
    @ManyToOne
    @JsonBackReference(value = "favorite-user")
    private User user;
}
