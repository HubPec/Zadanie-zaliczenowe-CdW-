package src.main.Shape;

import src.main.Shape.Shape1.Shape;

public class Square extends Shape {
    private double side = 1.0;
// Klasa zajmująca się obliczaniem kwadratu
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    // Wyznaczanie długości ściany kwadratu


    public double getArea() {
        return getSide() * getSide();
    }
    // Obliczanie Pola kwadratu
    public double getPerimeter() {
        return 4 * getSide();
    }
    // Obliczanie obwodu kwadratu
    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
