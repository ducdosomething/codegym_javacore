package task3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * th5_min_in_array
 */
public class th5_min_in_array {

    public static void main(String[] args) {
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

        int minNumber = minValue(array);
        System.out.println("Min = " + minNumber);
    }

    public static int minValue(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}