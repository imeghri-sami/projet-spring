package com.app_server.application.models;

import lombok.*;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ingredient {
    @Id
    private int refIngr;
    private String imfIngr;
    private String nofIngr;
    private float prifIngr;
    private int unifIngr;

    @OneToMany(targetEntity = Contient.class)
    private List<Contient> contientList;
}
