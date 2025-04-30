package homework;

import java.util.Arrays;

public class QuestionSeven {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr =  {12,14,23,45,66,68,70,77,90,91};
        System.out.println(Arrays.toString(arr));
        int i = 0;
        int j = arr.length-1;
        while (i < j){
            if (arr[i] % 2 == 0 && arr[j] % 2 == 1) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else if (arr[i] % 2 == 0 && arr[j] % 2 == 0) {
                j--;
            } else if (arr[i] % 2 == 1 && arr[j] % 2 == 0) {
                i++;
                j--;
            } else if (arr[i] % 2 == 1 && arr[j] % 2 == 1) {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
