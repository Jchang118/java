package homework;

import java.util.Arrays;

public class QuestionNine {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = copyOf(arr, 3);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] copyOf(int[] arr, int newLength) {
        int[] newArr = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
