package com.platzi.market.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "compras_productos")
public class ProductPurchase {

    @EmbeddedId
    private ProductPurchasePK id;

    @Column(name = "cantidad")
    private Integer amount;

    @Column(name = "total")
    private Double total;

    @Column(name = "estado")
    private Boolean state;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    @JsonIgnore
    private Purchase purchase;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    @JsonIgnore
    private Product product;

}
