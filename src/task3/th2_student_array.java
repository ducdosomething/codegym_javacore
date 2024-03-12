package task3;

import java.util.Scanner;

/**
 * th2_student_array
 */
public class th2_student_array {

    public static void main(String[] args) {
        String[] students = { "David", "Tom", "Susan" };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student name: ");
        String inputName;
        inputName = sc.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                System.out.printf("Position of %s is " + i, inputName);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.printf("%s is not found in the list!", inputName);
        }
        sc.close();
    }
}