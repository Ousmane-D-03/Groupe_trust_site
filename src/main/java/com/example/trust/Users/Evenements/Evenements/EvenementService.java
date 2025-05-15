package com.example.trust.Users.Evenements.Evenements;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvenementService {

    @Autowired
    private EvenementRepository evenementRepository;

    public List<Evenement> findAll() {
        return evenementRepository.findAll();
    }

    public Evenement findById(Long id) {
        return evenementRepository.findById(id).orElse(null);
    }

    public Evenement save(Evenement evenement) {
        return evenementRepository.save(evenement);
    }
}
