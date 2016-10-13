package test;

import sources.Circle;
import sources.GeometricObject;
import sources.Rectangle;

public class Test {
    public static void main(String[] args) {
        GeometricObject shape = new Rectangle(10,5);
        System.out.println(shape+"\n");
        shape.setColor("Green");
        shape.setFilled(false);
        System.out.println(shape+"\n");
        GeometricObject shaky = new Circle(10);
        System.out.println(shaky+"\n");
        shaky.setColor("Azul");
        shaky.setFilled(false);
        System.out.println(shaky+"\n");
    }
}
