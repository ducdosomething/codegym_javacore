package task3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * bt5_min_in_array
 */
public class bt5_min_in_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of array: ");
        size = sc.nextInt();
        int[] array;

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }

        System.out.printf("Element in array: \n", "");
        System.out.println(Arrays.toString(array));

        int min = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
            }
        }
        System.out.println("Min = " + min);
    }
}