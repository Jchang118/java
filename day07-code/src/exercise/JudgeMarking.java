package exercise;

import java.util.Arrays;
import java.util.Random;

public class JudgeMarking {
    public static void main(String[] args) {
        marking();
    }

    public static void marking() {
        int[] arr = new int[6];
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            arr[i] = random.nextInt(100);
        }
        int max = max(arr);
        int min = min(arr);
        int total = sum(arr) - max - min;
        double average = (total + 0.0) / 4;
        System.out.println("评委的打分为: " + Arrays.toString(arr));
        System.out.println("去掉一个最高分: " + max);
        System.out.println("去掉一个最低分: " + min);
        System.out.println("总分为: " + total + ", 平均分为: " + average);
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
