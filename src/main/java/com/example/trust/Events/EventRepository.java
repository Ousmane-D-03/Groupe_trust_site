package com.example.trust.Events;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.qos.logback.core.spi.ConfigurationEvent.EventType;

public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByType(EventType type);
    List<Event> findByPublishedTrue(); // pour afficher uniquement les événements visibles
}
