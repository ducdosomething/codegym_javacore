package task2;

import java.util.Scanner;

public class th1_prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int numberInput;
        numberInput = sc.nextInt();

        if (numberInput < 2) {
            System.out.println(numberInput + " is not a prime number");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(numberInput)) {
                if (numberInput % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(numberInput + " is a prime number");
            } else {
                System.out.println(numberInput + " is not a prime number");
            }
        }
    }
}
