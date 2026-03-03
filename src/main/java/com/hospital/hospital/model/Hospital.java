package com.hospital.hospital.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "cnpj")
    private String cnpj;

    public Hospital(String name, String phoneNumber, String cnpj) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.cnpj = cnpj;
    }
}
