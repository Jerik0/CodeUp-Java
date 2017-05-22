package Shapes;

abstract class Quadrilateral extends Shape implements Measurable {
        protected Double length;
        protected Double width;

        public Quadrilateral(){};

        public Quadrilateral(Double length, Double width) {
            this.length = length;
            this.width = width;
        }

        Double getLength(Double length) {
            return length;
        }

        Double getWidth(Double width) {
            return width;
        }

        abstract public void setLength(Double length);
        abstract public void setWidth(Double width);

}
