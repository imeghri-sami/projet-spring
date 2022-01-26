package com.app_server.application.models;

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
    private Recipe recipe;
    @ManyToOne
    private User user;
}
