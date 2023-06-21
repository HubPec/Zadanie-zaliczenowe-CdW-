package src.main.Shape.Shape1;

public class Shape {

    protected String color = "red";
    protected boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }
// Wyznaczanie koloru obiektu
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }
// Wyznaczanie wypełnienia obiektu
    public void setFilled(boolean filled) {
        this.filled = filled;
    }



    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }


}