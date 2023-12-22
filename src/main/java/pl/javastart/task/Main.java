package pl.javastart.task;

import pl.javastart.task.figures.Circle;
import pl.javastart.task.figures.Rectangle;
import pl.javastart.task.figures.Square;
import pl.javastart.task.figures.Triangle;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(2);
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(5, 10);
        Triangle triangle = new Triangle(3, 10, 4);
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        System.out.println(shapeCalculator.calculateSquareArea(square));
        System.out.println(shapeCalculator.calculateCircleArea(circle));
        System.out.println(shapeCalculator.calculateRectPerimeter(rectangle));
        System.out.println(shapeCalculator.calculateTrianglePerimeter(triangle));
    }
}
