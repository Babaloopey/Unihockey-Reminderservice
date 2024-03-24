package com.unihockeyreminderservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.sql.Time;
import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "match_einsatz")
public class MatchEinsatz extends Einsatz {
    private Date datum;
    private Time zeitpunkt;
    @ManyToOne
    private Gruppe gruppe;
    private String ort;
}
