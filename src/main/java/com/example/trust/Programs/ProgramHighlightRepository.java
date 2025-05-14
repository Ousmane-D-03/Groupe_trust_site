package com.example.trust.Programs;

import java.util.List;
import java.util.Optional;


public interface ProgramHighlightRepository {
    List<ProgramHighlight> findByType(String type);
    Optional<ProgramHighlight> findById(Long id);

    List<ProgramHighlight> findAll();
}
