package com.example.trust.Programs;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ProgramHighlightRepository extends JpaRepository<ProgramHighlight, Long> {
    List<ProgramHighlight> findByType(String type);
    Optional<ProgramHighlight> findById(Long id);

    List<ProgramHighlight> findAll();
}
