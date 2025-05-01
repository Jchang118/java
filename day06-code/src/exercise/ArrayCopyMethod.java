package exercise;

import java.util.Arrays;

public class ArrayCopyMethod {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = copyRange(arr1, 1, 3);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] copyRange(int[] arr, int start, int end) {
        int[] newArr = new int[end - start];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[start + i];
        }
        return newArr;
    }
}
