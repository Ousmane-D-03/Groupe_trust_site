package com.example.trust.Temoins;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestimonialRepository extends JpaRepository<Testimonial, Long> {
    List<Testimonial> findByPublishedTrue();
}
