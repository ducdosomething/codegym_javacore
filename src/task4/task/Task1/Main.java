package task4.task.Task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = sc.nextDouble();
        System.out.print("Enter the height:");
        double height = sc.nextDouble();
        Th1_rectangle rectangle = new Th1_rectangle(width, height);
        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
        sc.close();
    }
}
