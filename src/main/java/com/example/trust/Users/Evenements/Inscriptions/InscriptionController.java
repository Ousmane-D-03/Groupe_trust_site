package com.example.trust.Users.Evenements.Inscriptions;


import com.example.trust.Users.User;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.trust.Users.UserRepository;
import com.example.trust.Users.Evenements.Evenements.Evenement;
import com.example.trust.Users.Evenements.Evenements.EvenementService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/inscriptions")
public class InscriptionController {

    @Autowired
    private InscriptionService inscriptionService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EvenementService evenementService;

    @PostMapping("/create")
    public ResponseEntity<?> createInscription(@RequestParam Long userId, @RequestParam Long evenementId) {
        Optional<User> userOpt = userRepository.findById(userId);
        if (userOpt.isEmpty()) {
            return ResponseEntity.badRequest().body("Utilisateur introuvable");
        }

        Evenement evenement = evenementService.findById(evenementId);
        if (evenement == null) {
            return ResponseEntity.badRequest().body("Événement introuvable");
        }

        Inscription inscription = new Inscription();
        inscription.setUser(userOpt.get());
        inscription.setEvenement(evenement);
        inscription.setConfirmation(false);
        Inscription saved = inscriptionService.save(inscription);
        return ResponseEntity.ok(saved);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<?> getInscriptionsByUser(@PathVariable Long userId) {
        Optional<User> userOpt = userRepository.findById(userId);
        if (userOpt.isEmpty()) {
            return ResponseEntity.badRequest().body("Utilisateur introuvable");
        }

        List<Inscription> inscriptions = inscriptionService.findByUser(userOpt.get());
        return ResponseEntity.ok(inscriptions);
    }
}
