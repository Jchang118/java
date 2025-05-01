package exercise;

import java.util.Scanner;

public class ExistMethod {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询的整数:");
        int x = sc.nextInt();
        if (exist(arr, x)) {
            System.out.println("存在");
        } else {
            System.out.println("不存在");
        }
    }

    public static boolean exist(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
