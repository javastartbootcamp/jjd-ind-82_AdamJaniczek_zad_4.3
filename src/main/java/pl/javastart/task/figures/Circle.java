package pl.javastart.task.figures;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double surface() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
