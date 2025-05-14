package com.example.trust.Timeline;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TimelineRepository extends JpaRepository<TimelineEntry, Long> {}