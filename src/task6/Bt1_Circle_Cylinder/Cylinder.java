package task6.Bt1_Circle_Cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double height) {
        // vị trí nak
//        super(5, "RED");
//        super.setColor("RED");
//        super.setRadius(5);
        this.setColor("RED");
        this.setRadius(5);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.getArea()*this.height;
    }

    @Override
    public void setRadius(double radius) {
        super.setRadius(10 + radius);
    }

    @Override
    public String toString() {
        return "Cylinder [height=" + height + "]";
    }
}
