package task2;

import java.util.Scanner;

public class bt2_first_20_prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfPrime;
        System.out.println("Enter a number of prime number: ");
        numberOfPrime = sc.nextInt();
        int numberInput;
        System.out.println("Enter a number: ");
        numberInput = sc.nextInt();

        int count = 0;

        int n = 2;
        while (count < numberOfPrime) {
            while (n <= Math.sqrt(numberInput)) {
                if (numberInput % n == 0) {
                    count++;
                }
                n++;
            }
        }
    }
}
