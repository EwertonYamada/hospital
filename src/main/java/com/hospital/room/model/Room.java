package com.hospital.room.model;

import com.hospital.ward.model.Ward;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "room_code")
    private String roomCode;

    @ManyToOne
    @JoinColumn(name = "ward_id")
    private Ward ward;

}
