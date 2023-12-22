package pl.javastart.task.figures;

public class Triangle {
    private double adjoining;
    private double height;
    private double hypotenuse;

    public Triangle(double adjoining, double height, double hypotenuse) {
        this.adjoining = adjoining;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }

    public double getAdjoining() {
        return adjoining;
    }

    public double getHeight() {
        return height;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public double surface() {
        return (this.adjoining * this.height) / 2;
    }
}
