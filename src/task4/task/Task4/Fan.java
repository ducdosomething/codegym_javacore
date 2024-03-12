package task4.task.Task4;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // Phương thức khởi tạo không tham số tạo đối tượng Fan mặc định
    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5.0;
        this.color = "blue";
    }

    public static int getSlow() {
        return SLOW;
    }

    public static int getMedium() {
        return MEDIUM;
    }

    public static int getFast() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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

    public String toString() {
        if (this.on == true) {
            return "Speed: " + speed + "; color: " + color + "; radius: " + radius + ", fan is on";
        } else {
            return "Color: " + color + "; radius: " + radius + ", fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        Fan fan2 = new Fan();
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setOn(false);

        System.out.println("Fan1 infor: " + fan1.toString());
        System.out.println("Fan1 infor: " + fan2.toString());
    }
}
