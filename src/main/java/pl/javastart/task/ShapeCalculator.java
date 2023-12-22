package pl.javastart.task;

import pl.javastart.task.figures.Circle;
import pl.javastart.task.figures.Rectangle;
import pl.javastart.task.figures.Square;
import pl.javastart.task.figures.Triangle;

public class ShapeCalculator {

    double calculateSquareArea(Square square) {
        return Math.pow(square.getLength(), 2);
    }

    double calculateCircleArea(Circle circle) {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }

    double calculateRectPerimeter(Rectangle rectangle) {
        return rectangle.getA() * rectangle.getB();
    }

    double calculateTrianglePerimeter(Triangle triangle) {
        return (triangle.getAdjoining() * triangle.getHeight()) / 2;
    }
}
