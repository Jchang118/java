package exercise;

import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        SwapFunc(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void SwapFunc(int[] arr) {
        for (int i = 0; i < (arr.length / 2); i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}
