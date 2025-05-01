package homework;

import java.util.Arrays;

public class QuestionSeven {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr));
        fill(arr, 888);
        System.out.println(Arrays.toString(arr));
    }

    public static void fill(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) arr[i] = value;
    }
}
