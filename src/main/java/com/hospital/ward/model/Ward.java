package com.hospital.ward.model;

import com.hospital.hospital.model.Hospital;
import com.hospital.ward.enums.Specialty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Ward {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "speciality")
    @Enumerated(EnumType.STRING)
    private Specialty speciality;

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;
}
