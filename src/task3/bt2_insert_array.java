package task3;

import java.util.Arrays;
import java.util.Scanner;

public class bt2_insert_array {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number need to insert: ");
        int insertNumber;
        insertNumber = sc.nextInt();
        System.out.println("Enter a insert index: ");
        int insertIndex;
        insertIndex = sc.nextInt();

        if (insertIndex <= -1 && insertIndex >= array.length - 1) {
            System.out.println("Error!");
        } else {
            int[] newArray = new int[array.length + 1];
            int newIndex = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == insertIndex) {
                    newArray[newIndex] = array[i];
                    newIndex++;
                }
                System.out.println(Arrays.toString(newArray));
            }
        }

        sc.close();
    }
}
