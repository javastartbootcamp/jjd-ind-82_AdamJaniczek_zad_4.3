package pl.javastart.task.figures;

public class Square {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public void setLength(double a) {
        this.a = a;
    }

    public double getLength() {
        return a;
    }

    public double surface() {
        return this.a * this.a;
    }
}
