package com.platzi.market.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "productos")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer productId;

    @Column(name = "nombre")
    private String name;

    @Column(name = "id_categoria")
    private Integer categorieId;

    @Column(name = "codigo_barras")
    private String barCode;

    @Column(name = "cantidad_stock")
    private Integer stockAmount;

    @Column(name = "estado")
    private Boolean state;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_categoria" , insertable = false, updatable = false)
    @JsonIgnore
    private Categorie categorie;
}
