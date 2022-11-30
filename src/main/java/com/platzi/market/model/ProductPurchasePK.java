package com.platzi.market.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;


@Embeddable
@Data
public class ProductPurchasePK implements Serializable {

    @Column(name = "id_compra")
    private Integer purchaseId;

    @Column(name = "id_producto")
    private Integer productId;
}
