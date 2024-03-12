package task4.task.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a;
        a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b;
        b = sc.nextDouble();
        System.out.println("Enter c: ");
        double c;
        c = sc.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta < 0) {
            System.out.println("The equation has no solutions!");
        } else if (delta == 0) {
            System.out.println("The equation has a double solution: ");
            System.out.println("x1 = x1 = " + quadraticEquation.getRoot3());
        } else {
            System.out.println("The equation has 2 solutions: ");
            System.out.println("r1 = " + quadraticEquation.getRoot1());
            System.out.println("r2 = " + quadraticEquation.getRoot2());
        }
    }
}
