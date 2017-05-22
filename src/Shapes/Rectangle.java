package Shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    @Override
    public Double getArea(Double width, Double length) {
        Double result = length * width;
        return result;
    }

    @Override
    public Double getPerimeter(Double width, Double length) {
        Double result = (2 * width) + (2 * length);
        return result;
    }

    @Override
    Double getWidth(Double width) {
        return super.getWidth(width);
    }

    @Override
    Double getLength(Double length) {
        return super.getLength(length);
    }

    public void setWidth(Double width) {this.width = width;}

    public void setLength(Double length) {this.length = length;}

}
