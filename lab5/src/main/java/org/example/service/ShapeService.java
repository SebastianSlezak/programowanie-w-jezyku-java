package org.example.service;

import org.example.Rectangle;
import org.example.Shape;
import org.example.Triangle;
import org.example.repository.TriangleRepository;
import org.example.repository.RectangleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShapeService {
    private final RectangleRepository rectangleRepository;
    private final TriangleRepository triangleRepository;

    @Autowired
    public ShapeService(RectangleRepository rectangleRepository, TriangleRepository triangleRepository) {
        this.rectangleRepository = rectangleRepository;
        this.triangleRepository = triangleRepository;
    }

    public Shape saveShape(Shape shape) {
        if (shape instanceof Rectangle) {
            return rectangleRepository.save((Rectangle) shape);
        } else if (shape instanceof Triangle) {
            return triangleRepository.save((Triangle) shape);
        } else {
            throw new IllegalArgumentException("unknown shape type");
        }
    }

    public List<Shape> getAllShapes() {
        List<Shape> allShapes = new ArrayList<>();
        allShapes.addAll(rectangleRepository.findAll());
        allShapes.addAll(triangleRepository.findAll());
        return allShapes;
    }
}