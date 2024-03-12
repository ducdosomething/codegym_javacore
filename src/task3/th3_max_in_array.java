package task3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * th3_max_in_array
 */
public class th3_max_in_array {

    public static void main(String[] args) {
        // int[] array = { 11, 2, 3, 4, 5, 6 };
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.printf("Element in array: \n", "");
        System.out.println(Arrays.toString(array));

        int max = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
            }
        }
        System.out.println("Max = " + max);
    }
}