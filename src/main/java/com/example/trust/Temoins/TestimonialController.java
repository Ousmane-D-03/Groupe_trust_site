package com.example.trust.Temoins;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/testimonials")
public class TestimonialController {

    @Autowired
    private TestimonialRepository testimonialRepository;

    @GetMapping
    public List<Testimonial> getAll() {
        return testimonialRepository.findAll();
    }
}
