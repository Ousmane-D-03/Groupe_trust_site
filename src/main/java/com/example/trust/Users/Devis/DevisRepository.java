package com.example.trust.Users.Devis;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trust.Users.User;

import java.util.List;

public interface DevisRepository extends JpaRepository<Devis, Long> {
    List<Devis> findByUser(User user);
}
