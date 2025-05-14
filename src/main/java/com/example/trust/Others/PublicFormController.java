package com.example.trust.Others;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PublicFormController {

    @Autowired private ContactMessageRepository contactRepo;
    @Autowired private QuoteRequestRepository quoteRepo;

    @PostMapping("/contact")
    public ResponseEntity<String> sendMessage(@RequestBody ContactMessage message) {
        contactRepo.save(message);
        return ResponseEntity.ok("Message reçu !");
    }

    @PostMapping("/quotes")
    public ResponseEntity<String> requestQuote(@RequestBody QuoteRequest quote) {
        quoteRepo.save(quote);
        return ResponseEntity.ok("Demande de devis enregistrée !");
    }
}
/*format json contact : {
  "name": "Marie",
  "email": "marie@example.com",
  "subject": "Question sur vos services",
  "message": "Bonjour, je voudrais en savoir plus sur le coaching."
}
format quotes:
 {
  "companyName": "ABC Consulting",
  "participants": 12,
  "objective": "Cohésion d'équipe",
  "location": "Dakar",
  "contactEmail": "contact@abc.com"
}

*/