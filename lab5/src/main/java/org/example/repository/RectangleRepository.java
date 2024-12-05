package org.example.repository;

import org.example.Rectangle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RectangleRepository extends JpaRepository<Rectangle, Long> {}