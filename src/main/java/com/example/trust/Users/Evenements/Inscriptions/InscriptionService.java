package com.example.trust.Users.Evenements.Inscriptions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trust.Users.User;

import java.util.List;

@Service
public class InscriptionService {

    @Autowired
    private InscriptionRepository inscriptionRepository;

    public Inscription save(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    public List<Inscription> findByUser(User utilisateur) {
        return inscriptionRepository.findByUser(utilisateur);
    }
}
