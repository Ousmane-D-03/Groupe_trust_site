package com.example.trust.Users.Devis;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trust.Users.User;

import java.util.List;
import java.util.Optional;

@Service
public class DevisService {

    @Autowired
    private DevisRepository devisRepository;

    public Devis createDevis(Devis devis) {
        return devisRepository.save(devis);
    }

    public List<Devis> getDevisByUser(User user) {
        return devisRepository.findByUser(user);
    }
   
    public void deleteDevis(Long devisId) {
        devisRepository.deleteById(devisId);
    }

    public Optional<Devis> getDevisById(Long devisId) {
        return devisRepository.findById(devisId);
    }
}
