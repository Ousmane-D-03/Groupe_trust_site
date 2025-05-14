package com.example.trust.Events;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.spi.ConfigurationEvent.EventType;

@RestController
@RequestMapping("/api/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @GetMapping
    public List<Event> getEvents(@RequestParam(required = false) EventType type) {
        if (type != null) {
            return eventService.getByType(type);
        }
        return eventService.getAll();
    }
}


/*la reponse json :
 * [
  {
    "id": 1,
    "title": "Forum Premiers Pas - Dakar",
    "description": "Journée orientation France",
    "type": "FORUM",
    "date": "2025-07-05",
    "city": "Dakar",
    "location": "UCAD Amphithéâtre A",
    "published": true
  },
  {
    "id": 2,
    "title": "Caravane Ziguinchor",
    "description": "Orientation en région",
    "type": "CARAVANE",
    "date": "2025-07-20",
    "city": "Ziguinchor",
    "location": "Lycée Djignabo",
    "published": true
  }
]

 */