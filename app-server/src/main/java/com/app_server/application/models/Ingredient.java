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
    private int ref;
    private String img;
    private String name;
    private float price;
    private int unit;

    @OneToMany(mappedBy = "ingredient")
    private List<Content> contentList;
}
