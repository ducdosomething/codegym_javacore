package task2;

import java.util.Scanner;

public class th2_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        double money;
        money = sc.nextDouble();
        System.out.println("Enter number of months: ");
        int month;
        month = sc.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        double interestRate;
        interestRate = sc.nextDouble();

        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
