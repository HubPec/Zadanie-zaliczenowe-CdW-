package src.main.Shape;


import src.main.Shape.Shape1.Shape;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;
//Klasa zajmująca się obliczaniem prostokąta
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }
// Wyznaczanie szerokości prostokąta
    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }
// Wyznaczanie długości prostokąta
    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return getLength() * getWidth();
    }
// Obliczanie pola prostokąta
    public double getPerimeter() {
        return 2 * getLength() + 2 * getWidth();
    }
// Obliczanie obwodu prostokąta
    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}