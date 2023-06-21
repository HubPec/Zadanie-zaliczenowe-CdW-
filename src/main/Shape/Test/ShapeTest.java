package src.main.Shape.Test;

import src.main.Shape.Circle;
import src.main.Shape.Rectangle;
import src.main.Shape.Square;

public class ShapeTest {

    // Jest to Program zajmujący się tworzeniem kształtów i obliczaniem/wyznaczaniem ich parametrów(wielkości, powierzchni, kolorze i wypełnieniu)
    public static void main(String[] args){
        Circle c1 = new Circle("red", false, 5.5);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        Rectangle r1 = new Rectangle("red", false, 1.0, 2.0);
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());


        Square sq1 = new Square(6.6);
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getPerimeter());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());


    }
}
