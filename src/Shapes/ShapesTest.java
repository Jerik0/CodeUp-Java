package Shapes;

import InputStuff.Input;

public class ShapesTest {

    public static Input listener = new Input();
    static Square square;
    static Rectangle rectangle;

    public static void main(String[] args) {
        System.out.println("Type the length of the quadrilateral");
        double result1 = listener.getDouble();
        System.out.println("Type the width of the quadrilateral");
        double result2 = listener.getDouble();
        square = new Square(result1);
        rectangle = new Rectangle(result1, result2);
        System.out.println("The Perimeter of your rectangle is: " + rectangle.getPerimeter());
        System.out.println("The Area of your rectangle is: " + rectangle.getArea());
    }

}
