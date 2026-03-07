package com.hospital.hospital.model;

import com.hospital.ward.model.Ward;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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

    @OneToMany(mappedBy = "hospital", cascade = CascadeType.ALL)
    private List<Ward> wards;

    public Hospital(String name, String phoneNumber, String cnpj) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.cnpj = cnpj;
    }
}
