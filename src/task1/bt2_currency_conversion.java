package task1;

import java.util.Scanner;

public class bt2_currency_conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        int vndValue;
        int usdValue;
        System.out.println("Enter option: ");
        option = sc.nextInt();
        if (option == 1) {
            System.out.println("Enter a VND: ");
            vndValue = sc.nextInt();
            usdValue = vndValue / 23000;
            System.out.printf("%dVND is " + usdValue + "USD", vndValue);
        } else if (option == 2) {
            System.out.println("Enter a USD: ");
            usdValue = sc.nextInt();
            vndValue = usdValue * 23000;
            System.out.printf("%dUSD is " + vndValue + "VND", usdValue);
        } else {
            System.out.println("Please enter the option 1 for VNDtoUSD or 2 for USDtoVND");
        }
    }
}
