package task6.Bt1_Circle_Cylinder;

public class Circle {
    /*
    Kế thùa:  quan hệ cha con
        cha: thuộc tính và phương thúc MÀ lớp cha cho phép
        override:
     */
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getArea(int a){
        return 0;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }
}
