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
public class Image {

    @Id
    private int refImg;
    private String urlImg;

    @ManyToOne()
    private Recette recette;
}
