package exercise;

import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 1;
        }
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("sum = " + sum);
        int avg = sum / arr.length;
        System.out.println("avg = " + avg);
        int countSmaller = 0;
        for (int j : arr) {
            if (j > avg) {
                countSmaller++;
            }
        }
        System.out.println("countSmaller = " + countSmaller);
    }
}
