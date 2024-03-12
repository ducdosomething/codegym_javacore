package task3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * reverse_array
 */
public class th1_reverse_array {

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

        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }

        System.out.println("Reverse array: ");
        System.out.println(Arrays.toString(array));

    }
}
