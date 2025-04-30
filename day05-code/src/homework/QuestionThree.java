package homework;

import java.util.Arrays;
import java.util.Random;

public class QuestionThree {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("数组元素的和为：" + sum);
    }
}
