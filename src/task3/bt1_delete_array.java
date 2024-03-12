package task3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * bt1_delete_array
 */
public class bt1_delete_array {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number need to delete: ");
        int inputNumber;
        inputNumber = sc.nextInt();
        int inputNumberIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == inputNumber) {
                System.out.println("Index of deleted number: " + i);
            }
            inputNumberIndex = i;
        }

        for (int i = inputNumberIndex; i < (array.length - 1); i++) {
            array[i] = array[i + 1];
        }

        int[] newArray = new int[array.length - 1];
        int newIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != inputNumber) {
                newArray[newIndex] = array[i];
                newIndex++;
            }
        }

        System.out.println(Arrays.toString(newArray));
        sc.close();
    }
}