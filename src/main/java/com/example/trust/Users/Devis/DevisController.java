package com.example.trust.Users.Devis;



import com.example.trust.Users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.trust.Users.UserRepository;

import java.util.*;

@RestController
@RequestMapping("/api/devis")
public class DevisController {

    @Autowired
    private DevisService devisService;

    @Autowired
    private UserRepository userRepository;

    // Création d'un devis (en liant à un utilisateur existant)
    @PostMapping("/create/{userId}")
    public ResponseEntity<?> createDevis(@PathVariable Long userId, @RequestBody Devis devis) {
        Optional<User> userOpt = userRepository.findById(userId);
        if (userOpt.isEmpty()) {
            return ResponseEntity.badRequest().body("Utilisateur introuvable");
        }

        devis.setUser(userOpt.get());
        Devis savedDevis = devisService.createDevis(devis);

        return ResponseEntity.ok(savedDevis);
    }

    // Lister tous les devis d’un utilisateur
    @GetMapping("/user/{userId}")
    public ResponseEntity<?> getDevisByUser(@PathVariable Long userId) {
        Optional<User> userOpt = userRepository.findById(userId);
        if (userOpt.isEmpty()) {
            return ResponseEntity.badRequest().body("Utilisateur introuvable");
        }

        List<Devis> devisList = devisService.getDevisByUser(userOpt.get());
        return ResponseEntity.ok(devisList);
    }

    // mise à jour d'un devis
    @PutMapping("/update/{devisId}")
    public ResponseEntity<?> updateDevis(@PathVariable Long devisId, @RequestBody Devis newData) {
        Optional<Devis> devisOpt = devisService.getDevisById(devisId);
        if (devisOpt.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        Devis existing = devisOpt.get();
        existing.setEntreprise(newData.getEntreprise());
        existing.setNombreParticipants(newData.getNombreParticipants());
        existing.setObjectifs(newData.getObjectifs());
        existing.setLieuSouhaite(newData.getLieuSouhaite());
        existing.setDateSoumission(newData.getDateSoumission());

        Devis updated = devisService.createDevis(existing);
        return ResponseEntity.ok(updated);
    }

    // Suppression d'un devis
    @DeleteMapping("/delete/{devisId}")
    public ResponseEntity<?> deleteDevis(@PathVariable Long devisId) {
        Optional<Devis> devisOpt = devisService.getDevisById(devisId);
        if (devisOpt.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        devisService.deleteDevis(devisId);
        return ResponseEntity.ok("Devis supprimé avec succès");
}


}
/*la reponse json : 
 * {
  "entreprise": "Société ABC",
  "nombreParticipants": 20,
  "objectifs": "cohésion, créativité",
  "lieuSouhaite": "Dakar"
}
 */