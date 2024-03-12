package task3;

/**
 * insert_in_java
 */
public class insert_in_java {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };
        int a = 100;
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = 100;
        for (int element : newArray) {
            System.out.println(element);
        }
    }
}