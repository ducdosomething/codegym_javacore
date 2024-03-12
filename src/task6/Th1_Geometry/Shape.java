package task6.Th1_Geometry;

/**
 * Shape
 */
public class Shape {

    private String color = "green";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean isFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A shape color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }

}