package com.example.trust.Users.Evenements.Inscriptions;


import com.example.trust.Users.User;
import com.example.trust.Users.Evenements.Evenements.Evenement;

import jakarta.persistence.*;

@Entity
@Table(name = "inscriptions")
public class Inscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Lien vers utilisateur
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Lien vers événement
    @ManyToOne
    @JoinColumn(name = "evenement_id")
    private Evenement evenement;

    // Exemples d'infos complémentaires
    private boolean confirmation; // si l'inscription a été validée

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public Evenement getEvenement() { return evenement; }
    public void setEvenement(Evenement evenement) { this.evenement = evenement; }

    public boolean isConfirmation() { return confirmation; }
    public void setConfirmation(boolean confirmation) { this.confirmation = confirmation; }
   

}
