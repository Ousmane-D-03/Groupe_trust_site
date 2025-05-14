package com.example.trust.Programs;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "program_highlights")
public class ProgramHighlight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(length = 1000)
    private String description;

    private LocalDate nextDate;

    private String cities; // Ou liste à parser s'il y a plusieurs

    private String type; // ex : FORUM, CARAVANE, TEAM_BUILDING

    private String imageUrl;

    // Getters, setters
}