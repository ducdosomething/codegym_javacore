package task3;

import java.util.Scanner;

/**
 * bt8_count_char
 */
public class bt8_count_char {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hoang Ha";
        System.out.println("Enter a char: ");
        char inputChar;
        inputChar = sc.next().charAt(0);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == inputChar)
                count++;
        }
        System.out.printf("\n The number of %s in the string is " + count, inputChar);
    }
}