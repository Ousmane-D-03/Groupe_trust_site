package com.example.trust.Medias;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MediaService {

    @Autowired
    private MediaItemRepository repo;

    public List<MediaItem> getPublished() {
        return repo.findByPublishedTrue();
    }

    public List<MediaItem> getByType(MediaType type) {
        return repo.findByType(type).stream()
                .filter(item -> item.isPublished())
                .collect(Collectors.toList());
    }
}
/*les reponse json temoignage :
 * {
  "id": 1,
  "author": "Fatou Ndiaye",
  "content": "Une super expérience de team building !",
  "service": "Team Building",
  "mediaUrl": "https://mon-site/images/temoignage1.jpg",
  "published": true,
  "date": "2024-06-15"
}
realisation 
{
  "id": 3,
  "title": "Atelier Coaching 2024",
  "url": "https://mon-site/videos/coaching-2024.mp4",
  "type": "VIDEO",
  "category": "Coaching",
  "published": true
}

 */