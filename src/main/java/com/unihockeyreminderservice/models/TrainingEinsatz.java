package com.unihockeyreminderservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "training_einsatz")
public class TrainingEinsatz extends Einsatz {
    private Date datum;
    @ManyToOne
    private Training training;
}
