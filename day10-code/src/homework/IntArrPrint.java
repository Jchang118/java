package homework;

import java.util.StringJoiner;

public class IntArrPrint {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(printArr(arr));
    }

    public static String printArr(int[] arr) {
        if (arr == null) return "null";
        else if (arr.length == 0) return "[]";
        else {
            StringJoiner sj = new StringJoiner(", ", "[", "]");
            for (int j : arr) {
                sj.add(j + "");
            }
            return sj.toString();
        }
    }
}
