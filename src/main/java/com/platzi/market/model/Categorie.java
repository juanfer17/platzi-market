package com.platzi.market.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="categorias")
public class Categorie {

    @Id
    @Column(name = "id_categoria")
    private Integer categorieId;

    @Column(name = "descripcion")
    private String description;

    @Column(name = "estado")
    private Boolean state;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "categorie")
    @JsonIgnore
    private List<Product> products;

}
