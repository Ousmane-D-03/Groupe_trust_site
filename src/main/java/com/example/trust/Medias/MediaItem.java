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

    private String url;
    @Enumerated(EnumType.STRING)
    private MediaType type;
    private boolean published;

    public MediaItem() {}

    public MediaItem(String url, MediaType type, boolean published) {
        this.url = url;
        this.type = type;
        this.published = published;
    }

    // Getters et setters
    public Long getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public MediaType getType() {
        return type;
    }

    public boolean isPublished() {
        return published;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setType(MediaType type) {
        this.type = type;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }
}
