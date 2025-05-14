package com.example.trust.Others;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.trust.Timeline.TimelineEntry;
import com.example.trust.Timeline.TimelineRepository;

@RestController
@RequestMapping("/api/about")
public class AboutController {

    @Autowired private TimelineRepository timelineRepo;
    @Autowired private TeamRepository teamRepo;
    @Autowired private ValueRepository valueRepo;

    @GetMapping("/timeline")
    public List<TimelineEntry> getTimeline() {
        return timelineRepo.findAll(Sort.by("date").ascending());
    }

    @GetMapping("/team")
    public List<TeamMember> getTeam() {
        return teamRepo.findAll();
    }

    @GetMapping("/values")
    public List<ValueStatement> getValues() {
        return valueRepo.findAll();
    }
}

/* le json : 
 * Une fois terminé, le front-end Vue pourra consommer :

    /api/about/timeline → pour construire la frise chronologique

    /api/about/team → pour la grille de l’équipe

    /api/about/values → pour les icônes/valeurs
 */