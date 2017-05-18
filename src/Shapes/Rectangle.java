package Shapes;

public class Rectangle {

    private double length;
    private double width;

    public double getArea() {
        double areaTotal;
        areaTotal = (length * width);
        return areaTotal;
    }

    public double getPerimeter() {
        double perimTotal;
        perimTotal = ((2 * length) + (2 * width));
        return perimTotal;
    }

}
