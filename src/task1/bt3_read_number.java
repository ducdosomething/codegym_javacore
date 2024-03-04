package task1;

import java.util.Scanner;

public class bt3_read_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberInput;
        System.out.println("Enter a number: ");
        numberInput = sc.nextInt();

        System.out.printf("Số %d đọc thành chữ: " + readNumber(numberInput));

    }

    public static String readNumber(int numberInput) {
        if (numberInput >= 1 && numberInput <= 99) {
            int tens = numberInput / 10;
            int ones = numberInput % 10;

            String strTens = readTens(tens);
            String strOnes = readOnes(ones);

            if (tens > 1) {
                return strTens + " mươi " + strOnes;
            } else if (tens == 1 && ones >0) {
                return "mười " + strOnes;
            } else {
                return strOnes;
            }
        } else {
            return "Số không hợp lệ";
        }
    }

    public static String readTens(int tens) {
        switch (tens) {
            case 1:
                return "Mười";
            case 2:
                return "Hai mươi";
            case 3:
                return "Ba mươi";
            case 4:
                return "Bốn mươi";
            case 5:
                return "Năm mươi";
            case 6:
                return "Sáu mươi";
            case 7:
                return "Bảy mươi";
            case 8:
                return "Tám mươi";
            case 9:
                return "Chín mươi";
            default:
                return ""; // Trường hợp ngoại lệ không xảy ra
        }
    }

    public static String readOnes(int ones) {
        switch (ones) {
            case 0:
                return "";
            case 1:
                return "một";
            case 2:
                return "hai";
            case 3:
                return "ba";
            case 4:
                return "bốn";
            case 5:
                return "năm";
            case 6:
                return "sáu";
            case 7:
                return "bảy";
            case 8:
                return "tám";
            case 9:
                return "chín";
            default:
                return ""; // Trường hợp ngoại lệ không xảy ra
        }
    }
}
