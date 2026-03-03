package com.hospital.bed.model;

import com.hospital.bed.enums.BedType;
import com.hospital.room.model.Room;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Bed {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "bed_code")
    private String bedCode;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @Column(name = "is_available")
    private Boolean isAvailable;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private BedType bedType;
}
