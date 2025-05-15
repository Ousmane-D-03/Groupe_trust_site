package com.example.trust.Users.Devis;


import jakarta.persistence.*;
import java.time.LocalDateTime;

import com.example.trust.Users.User;

@Entity
@Table(name = "devis")
public class Devis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String entreprise;
    private int nombreParticipants;
    private String objectifs;
    private String lieuSouhaite;

    private LocalDateTime dateSoumission = LocalDateTime.now();

    // Association à l'utilisateur
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Getters et setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getEntreprise() { return entreprise; }
    public void setEntreprise(String entreprise) { this.entreprise = entreprise; }

    public int getNombreParticipants() { return nombreParticipants; }
    public void setNombreParticipants(int nombreParticipants) { this.nombreParticipants = nombreParticipants; }

    public String getObjectifs() { return objectifs; }
    public void setObjectifs(String objectifs) { this.objectifs = objectifs; }

    public String getLieuSouhaite() { return lieuSouhaite; }
    public void setLieuSouhaite(String lieuSouhaite) { this.lieuSouhaite = lieuSouhaite; }

    public LocalDateTime getDateSoumission() { return dateSoumission; }
    public void setDateSoumission(LocalDateTime dateSoumission) { this.dateSoumission = dateSoumission; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}
