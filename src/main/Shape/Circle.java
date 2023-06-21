package src.main.Shape;

import src.main.Shape.Shape1.Shape;

public class Circle extends Shape {
    private double radius = 1.0;
// Klasa zajmująca się obliczaniem Koła
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    // Wyznaczanie promienia koła
    public double getArea () {
        return getRadius() * getRadius() * Math.PI;
    }
    // Obliczanie pola koła
    public double getPerimeter () {
        return 2 * getRadius() * Math.PI ;
    }
    // Obliczanie obwodu koła
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
