package com.unihockeyreminderservice.models;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Time;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "training")
public class Training {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @OneToOne
    private Gruppe gruppe;

    private Time zeitpunkt;
    @ManyToOne
    private Halle ort;
    private String bemerkung;
}
