package homework;

import java.util.Arrays;

public class QuestionEight {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        fill(array, 1, 4, 0);
        System.out.println(Arrays.toString(array));
    }

    public static void fill(int[] arr, int fromIndex, int toIndex, int val) {
        for (int i = fromIndex; i < toIndex; i++) {
            arr[i] = val;
        }
    }
}
