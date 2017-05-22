package Shapes;

public class Rectangle {

    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

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
