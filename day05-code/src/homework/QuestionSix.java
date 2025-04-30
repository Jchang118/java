package homework;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionSix {
    public static void main(String[] args) {
        int[] arr = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        int[] brr = new int[arr.length + 1];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要插入的数字：");
        int num = sc.nextInt();
        int i = 0;
        int j = arr.length - 1;
        while ((j - i) > 1) {
            int mid = (i + j) / 2;
            if (arr[mid] > num) {
                j = mid;
            } else if (arr[mid] < num) {
                i = mid;
            } else {
                j = mid;
            }
        }
        if (arr[j] < num) j++;
        if (arr[i] > num) j = i;
        for (int k = 0; k < j; k++) {
            brr[k] = arr[k];
        }
        brr[j] = num;
        for (int k = j + 1; k < brr.length; k++) {
            brr[k] = arr[k - 1];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));
    }
}
