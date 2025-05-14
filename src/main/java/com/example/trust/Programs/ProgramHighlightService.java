package com.example.trust.Programs;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramHighlightService {
    @Autowired
    private ProgramHighlightRepository repository;

    // recupération de tous les ProgramHighlights
    public List<ProgramHighlight> listAll() {
        return repository.findAll();
    }
    // recupération d'un ProgramHighlight par son id
    public Optional<ProgramHighlight> findById(Long id) {
        return repository.findById(id);
    }
    // recupération d'un ProgramHighlight par son type
    public List<ProgramHighlight> findByType(String type) {
        return repository.findByType(type);
    }
}
