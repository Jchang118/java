package exercise;

import java.util.Scanner;

public class PasswordDecoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入加密过后的数字密码:");
        String code = sc.nextLine();
        System.out.println("解密后的密码为: " + decode(code));
    }

    public static String decode(String code) {
        int[] arr = new int[code.length()];
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (code.charAt(i)) - 48;
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
