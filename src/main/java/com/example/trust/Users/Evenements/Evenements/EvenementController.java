package com.example.trust.Users.Evenements.Evenements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/evenements")
public class EvenementController {

    @Autowired
    private EvenementService evenementService;

    @GetMapping
    public ResponseEntity<List<Evenement>> getAllEvenements() {
        return ResponseEntity.ok(evenementService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Evenement> getEvenementById(@PathVariable Long id) {
        Evenement evenement = evenementService.findById(id);
        if (evenement == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(evenement);
    }
}
