package com.unihockeyreminderservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "helfer_einsatz")
public class HelferEinsatz extends Einsatz {
    @ManyToOne
    private Helfertermin helfertermin;
}
