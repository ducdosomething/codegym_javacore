package task6.Th1_Geometry;

public class Circle extends Shape {
    private double rađius = 1.0;

    public Circle() {
    }

    public Circle(double rađius) {
        this.rađius = rađius;
    }

    public Circle(String color, Boolean filled, double rađius) {
        super(color, filled);
        this.rađius = rađius;
    }

    public double getRađius() {
        return rađius;
    }

    public void setRađius(double rađius) {
        this.rađius = rađius;
    }

    public double getArea() {
        return Math.PI * rađius * rađius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * rađius;
    }

    @Override
    public String toString() {
        return "A circle with radius= "
                + getRađius()
                + ", which is a sub class of "
                + super.toString();
    }

}
