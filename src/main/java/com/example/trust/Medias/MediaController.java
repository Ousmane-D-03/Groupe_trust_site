package com.example.trust.Medias;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/realizations")
public class MediaController {

    @Autowired
    private MediaItemRepository repository;
    
    @GetMapping("/media")
    public List<MediaItem> getAllMedia() {
        return repository.findAll(); // ou findByPublishedTrue()
    }
    
}
