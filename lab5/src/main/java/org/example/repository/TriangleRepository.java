package org.example.repository;

import org.example.Triangle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TriangleRepository extends JpaRepository<Triangle, Long> {}