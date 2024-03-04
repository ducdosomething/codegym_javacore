package task1;

import java.util.Scanner;

public class bt1_display_greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nameInput;
        System.out.println("Enter a name: ");
        nameInput = sc.nextLine();
        System.out.println("Hello: " + nameInput);

    }
}
