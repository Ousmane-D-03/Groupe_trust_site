package com.example.trust.Users.Evenements.Evenements;


import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

import com.example.trust.Users.Evenements.Inscriptions.Inscription;

@Entity
@Table(name = "evenements")
public class Evenement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private String type; // "Forum", "Caravane", "Formation", etc.
    private String lieu;
    private LocalDateTime date;

    private String description;

    @OneToMany(mappedBy = "evenement")
    private List<Inscription> inscriptions;

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitre() { return titre; }
    public void setTitre(String titre) { this.titre = titre; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getLieu() { return lieu; }
    public void setLieu(String lieu) { this.lieu = lieu; }

    public LocalDateTime getDate() { return date; }
    public void setDate(LocalDateTime date) { this.date = date; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
