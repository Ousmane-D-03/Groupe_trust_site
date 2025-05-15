package com.example.trust.Services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trust.Programs.ProgramHighlight;


public interface ServiceRepository extends JpaRepository<ServiceOffering, Long> {
  List<ServiceOffering> findByNameContaining(String keyword);
  Optional<ServiceOffering> findById(Long id);

}
