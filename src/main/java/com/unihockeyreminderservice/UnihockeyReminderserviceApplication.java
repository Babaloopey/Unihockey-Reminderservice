package com.unihockeyreminderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UnihockeyReminderserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnihockeyReminderserviceApplication.class, args);
    }


    // TODO: Setup PostgreSQL DB in docker
    // TODO: Mindeste erforderliche Daten ausarbeiten (Personen, Training, Match)
    // TODO: Scheduler aufsetzen
    // TODO: Post-Funktion einbauen
    // TODO: Mail versenden

}
