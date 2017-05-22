package Shapes;

public class Rectangle extends Quadralateral implements Measurable {

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    double getWidth(double width) {
        return super.getWidth(width);
    }

    @Override
    double getLength(double length) {
        return super.getLength(length);
    }

    @Override
    double setWidth() {
        return 0;
    }

    @Override
    double setLength() {
        return 0;
    }
}
