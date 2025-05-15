package com.example.trust.Medias;

import com.example.trust.Medias.MediaType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MediaItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String url;
    
    @Enumerated(EnumType.STRING)
    private MediaType type;

    private String category; // ex : "Team Building", "Coaching"
    private boolean published;
    public Boolean isPublished() {
        // TODO Auto-generated method stub
        return published;}

    // Getters / Setters
}
