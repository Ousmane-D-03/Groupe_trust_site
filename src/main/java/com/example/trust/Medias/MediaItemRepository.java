package com.example.trust.Medias;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MediaItemRepository extends JpaRepository<MediaItem, Long> {
    List<MediaItem> findByPublishedTrue();
    List<MediaItem> findByType(MediaType type);
}