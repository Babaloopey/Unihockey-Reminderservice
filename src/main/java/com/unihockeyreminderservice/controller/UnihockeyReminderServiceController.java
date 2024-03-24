package com.unihockeyreminderservice.controller;

import com.unihockeyreminderservice.api.FixtureApi;
import com.unihockeyreminderservice.api.V1Api;
import com.unihockeyreminderservice.dto.EinsaetzeDto;
import com.unihockeyreminderservice.dto.InfoDto;
import com.unihockeyreminderservice.dto.PersonDto;
import com.unihockeyreminderservice.repositories.*;
import com.unihockeyreminderservice.services.FixtureService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
public class UnihockeyReminderServiceController implements V1Api, FixtureApi {

    @Autowired
    private final FixtureService fixtureService;

    @Autowired
    private final GruppeRepository gruppeRepository;

    @Autowired
    private final HalleRepository halleRepository;

    @Autowired
    private final HelferEinsatzRepository helferEinsatzRepository;

    @Autowired
    private final HelferterminRepository helferterminRepository;

    @Autowired
    private final MatchEinsatzRepository matchEinsatzRepository;

    @Autowired
    private final PersonRepository personRepository;

    @Autowired
    private final TrainingRepository trainingRepository;

    @Autowired
    private final TrainingEinsatzRepository trainingEinsatzRepository;

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return V1Api.super.getRequest();
    }

    @Override
    public ResponseEntity<InfoDto> addEinsaetze(List<EinsaetzeDto> einsaetzeDto) {
        return V1Api.super.addEinsaetze(einsaetzeDto);
    }

    @Override
    public ResponseEntity<InfoDto> addPersonen(List<PersonDto> personDto) {
        return V1Api.super.addPersonen(personDto);
    }

    @Override
    public ResponseEntity<EinsaetzeDto> getEinsaetze() {
        return V1Api.super.getEinsaetze();
    }

    @Override
    public ResponseEntity<InfoDto> initializeData() {
        fixtureService.initializeGruppen();
        fixtureService.initializeHallen();

        final InfoDto response = new InfoDto();
        response.setMessage("Daten erfolgreich initialisiert");

        return ResponseEntity.ok().body(response);
    }
}
