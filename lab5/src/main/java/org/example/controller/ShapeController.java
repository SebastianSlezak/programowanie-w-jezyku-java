package org.example.controller;

import org.example.Rectangle;
import org.example.Shape;
import org.example.Triangle;
import org.example.repository.TriangleRepository;
import org.example.repository.RectangleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/shapes")
public class ShapeController {

    @Autowired
    private RectangleRepository rectangleRepository;

    @Autowired
    private TriangleRepository triangleRepository;

    @GetMapping
    public List<Shape> getAllShapes() {
        List<Shape> allShapes = new ArrayList<>();
        allShapes.addAll(rectangleRepository.findAll());
        allShapes.addAll(triangleRepository.findAll());
        return allShapes;
    }

    @PostMapping("/rectangle")
    public Rectangle createRectangle(@RequestBody Rectangle rectangle) {
        return rectangleRepository.save(rectangle);
    }

    @PostMapping("/triangle")
    public Triangle createTriangle(@RequestBody Triangle triangle) {
        return triangleRepository.save(triangle);
    }
}