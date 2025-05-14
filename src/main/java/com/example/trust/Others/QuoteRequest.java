package com.example.trust.Others;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class QuoteRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String companyName;
    private Integer participants;
    private String objective;
    private String location;
    private String contactEmail;
    private LocalDateTime requestDate = LocalDateTime.now();
}
