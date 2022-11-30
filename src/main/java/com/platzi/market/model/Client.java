package com.platzi.market.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "clientes")
public class Client {

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String name;
    @Column(name = "apellidos")
    private String lastName;
    @Column(name = "celular")
    private String cellNumber;
    @Column(name = "direccion")
    private String address;
    @Column(name = "correo_electronico")
    private String email;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
    @JsonIgnore
    private List<Purchase> purchases;
}

