package com.unihockeyreminderservice.models;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Time;
import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "helfertermin")
public class Helfertermin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Date datum;
    private Time zeitpunkt;
    private String ort;
}
