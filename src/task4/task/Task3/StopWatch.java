package task4.task.Task3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StopWatch {
    private long startTime, endTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        if (endTime == 0) {
            return System.currentTimeMillis() - startTime;
        } else {
            return endTime - startTime;
        }
    }

    public void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Tìm phần tử nhỏ nhất trong đoạn chưa sắp xếp
            int minIndex = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Hoán đổi phần tử nhỏ nhất với phần tử đầu tiên trong đoạn chưa sắp xếp
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }

        // In ra mảng trước khi sắp xếp (chỉ in ra 10 phần tử đầu tiên để kiểm tra)
        System.out.println("Original array: ");
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, 10)));

        long startTime = stopWatch.getStartTime();

        stopWatch.selectionSort(arr);

        long endTime = stopWatch.getEndTime();

        System.out.println("Real time run selectionSort : " + (endTime - startTime) + " milliseconds");
    }
}
