package task3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * bt3_sum_array
 */
public class bt3_sum_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1;
        System.out.println("Enter the size of array1: ");
        size1 = sc.nextInt();
        int[] array1;

        array1 = new int[size1];
        int i = 0;
        while (i < array1.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array1[i] = sc.nextInt();
            i++;
        }

        int size2;
        System.out.println("Enter the size of array2: ");
        size2 = sc.nextInt();
        int[] array2;

        array2 = new int[size2];
        int j = 0;
        while (j < array2.length) {
            System.out.print("Enter element " + (j + 1) + ": ");
            array2[j] = sc.nextInt();
            j++;
        }

        System.out.printf("Element in array1: \n", "");
        System.out.println(Arrays.toString(array1));

        System.out.printf("Element in array2: \n", "");
        System.out.println(Arrays.toString(array2));

        int[] array3 = new int[array1.length + array2.length];
        int index = 0;
        for (int item : array1) {
            array3[index++] = item;
        }
        for (int item : array2) {
            array3[index++] = item;
        }

        System.out.printf("Element in array3: \n", "");
        System.out.println(Arrays.toString(array3));
    }
}
