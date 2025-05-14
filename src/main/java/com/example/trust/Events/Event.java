package com.example.trust.Events;

import java.time.LocalDate;

import ch.qos.logback.core.spi.ConfigurationEvent.EventType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    @Enumerated(EnumType.STRING)
    private EventType type; // FORUM, CARAVANE, FORMATION, AUTRE

    private LocalDate date;
    private String city;
    private String location;
    private boolean published;
    public Boolean isPublished() {
        // TODO Auto-generated method stub
        return published;
    }
}