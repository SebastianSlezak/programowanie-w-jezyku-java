package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "rectangles")
public class Rectangle extends Shape{
    private double width, height;

    public Rectangle() {}

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "org.example.Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}