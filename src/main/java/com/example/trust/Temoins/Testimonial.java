package com.example.trust.Temoins;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Testimonial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String author;
    private String content;
    private String service; // optionnel : type de service associé

    private String mediaUrl; // image ou vidéo
    private boolean published;

    private LocalDate date;

    // Getters / Setters
}
