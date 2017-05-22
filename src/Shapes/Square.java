package Shapes;

public class Square extends Rectangle {

    public Square(double sides) {
        super(sides, sides);


        }

    public double getPerimeter(double sides) {
        double perimeter = 4 * sides;

        return perimeter;
    }

    public double getArea(double sides) {
        double area = (sides * sides);

        return area;
    }

}

