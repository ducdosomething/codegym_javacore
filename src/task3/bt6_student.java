package task3;

import java.util.Arrays;
import java.util.Scanner;

public class bt6_student {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a number of student list:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size does not exceed 30");
        } while (size > 30);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter student " + (i + 1) + " mark: ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.printf("Score board list: \n", "");
        System.out.println(Arrays.toString(array));

        int count = 0;
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("\n The number of students passing the exam is " + count);
    }
}
