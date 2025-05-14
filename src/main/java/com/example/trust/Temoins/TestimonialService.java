package com.example.trust.Temoins;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestimonialService {

    @Autowired
    private TestimonialRepository repo;

    public List<Testimonial> getPublished() {
        return repo.findByPublishedTrue();
    }
}