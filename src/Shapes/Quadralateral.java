package Shapes;

abstract class Quadralateral extends Shape implements Measurable {
        protected double length;
        protected double width;

        public void Quadralateral(double length, double width) {
            this.length = length;
            this.width = width;
        }

        double getLength(double length) {
            return length;
        }

        double getWidth(double width) {
            return width;
        }

        abstract double setLength();
        abstract double setWidth();

}
