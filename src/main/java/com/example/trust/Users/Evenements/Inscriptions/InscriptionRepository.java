package com.example.trust.Users.Evenements.Inscriptions;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trust.Users.User;

public interface InscriptionRepository extends JpaRepository<Inscription, Long> {
    List<Inscription> findByUser(User user);

}
