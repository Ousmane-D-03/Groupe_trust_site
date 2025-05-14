package com.example.trust.Events;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.qos.logback.core.spi.ConfigurationEvent.EventType;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    public List<Event> getAll() {
        return eventRepository.findByPublishedTrue();
    }

    public List<Event> getByType(EventType type) {
        return eventRepository.findByType(type).stream()
                .filter(e -> e.isPublished())
                .collect(Collectors.toList());
    }

}
