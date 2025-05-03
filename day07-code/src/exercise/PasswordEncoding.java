package exercise;

import java.util.Scanner;

public class PasswordEncoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字密码(必须为大于0的正整数):");
        String password = sc.nextLine();
        System.out.println("加密后的密码为: " +encode(password));
    }

    public static String encode(String password) {
        int[] arr = new int[password.length()];
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (password.charAt(i)) - 48;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            res += (char) (arr[i] + 48);
        }
        return res;
    }
}
