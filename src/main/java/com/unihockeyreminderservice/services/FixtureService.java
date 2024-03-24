package com.unihockeyreminderservice.services;

import com.unihockeyreminderservice.models.Gruppe;
import com.unihockeyreminderservice.models.GruppenName;
import com.unihockeyreminderservice.models.Halle;
import com.unihockeyreminderservice.models.HallenName;
import com.unihockeyreminderservice.repositories.GruppeRepository;
import com.unihockeyreminderservice.repositories.HalleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FixtureService {
    @Autowired
    private final GruppeRepository gruppeRepository;

    @Autowired
    private final HalleRepository halleRepository;

    public void initializeGruppen() {
        Gruppe gruppe1 = Gruppe.builder().name(GruppenName.A_Junioren).build();
        Gruppe gruppe2 = Gruppe.builder().name(GruppenName.B_Junioren).build();
        Gruppe gruppe3 = Gruppe.builder().name(GruppenName.C_Junioren).build();
        Gruppe gruppe4 = Gruppe.builder().name(GruppenName.D_Junioren).build();
        Gruppe gruppe5 = Gruppe.builder().name(GruppenName.E_Junioren).build();
        Gruppe gruppe6 = Gruppe.builder().name(GruppenName.A_Juniorinnen).build();
        Gruppe gruppe7 = Gruppe.builder().name(GruppenName.B_Juniorinnen).build();
        Gruppe gruppe8 = Gruppe.builder().name(GruppenName.C_Juniorinnen).build();
        Gruppe gruppe9 = Gruppe.builder().name(GruppenName.D_Juniorinnen).build();
        Gruppe gruppe10 = Gruppe.builder().name(GruppenName.E_Juniorinnen).build();
        gruppeRepository.saveAll(List.of(gruppe1, gruppe2, gruppe3, gruppe4, gruppe5, gruppe6, gruppe7, gruppe8, gruppe9, gruppe10));
    }

    public void initializeHallen() {
        Halle kantiHalle = Halle.builder().name(HallenName.Kanti).build();
        Halle sekHalle = Halle.builder().name(HallenName.Sek).build();
        halleRepository.saveAll(List.of(kantiHalle, sekHalle));
    }

}
