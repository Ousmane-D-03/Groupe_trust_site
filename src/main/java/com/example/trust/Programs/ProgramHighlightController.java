package com.example.trust.Programs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/programs/highlights")
public class ProgramHighlightController {

    @Autowired
    private ProgramHighlightService service;


    // GET /api/programs/highlights
    // ➤ Retourne tous les programmes phares
    @GetMapping
    public List<ProgramHighlight> getAll() {
        return service.listAll();
    }

    // GET /api/programs/highlights/{id}
    // ➤ Retourne un programme phare par son id
    @GetMapping("/{id}")
    public ResponseEntity<ProgramHighlight> getById(@PathVariable Long id) {
        return service.findById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }
    // GET /api/programs/highlights/type/{type}
    // ➤ Retourne tous les programmes phares par type
    @GetMapping("/type/{type}")
    public List<ProgramHighlight> getByType(@PathVariable String type) {
        return service.findByType(type.toUpperCase());
    }
}
/* j ai le type de json Retourne :
 * [
  {
    "id": 1,
    "title": "Forum Premiers pas de l'étudiant en France",
    "description": "Forum d'accompagnement pour futurs étudiants à l'étranger.",
    "nextDate": "2025-07-10",
    "cities": "Dakar, Saint-Louis",
    "type": "FORUM",
    "imageUrl": "https://monsite.com/images/forum1.jpg"
  },
  {
    "id": 2,
    "title": "Caravane de l’orientation",
    "description": "Sessions d’orientation dans plusieurs régions du pays.",
    "nextDate": "2025-08-15",
    "cities": "Ziguinchor, Kaolack",
    "type": "CARAVANE",
    "imageUrl": "https://monsite.com/images/caravane.jpg"
  }
]
*/