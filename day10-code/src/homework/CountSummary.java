package homework;

import java.util.Scanner;

public class CountSummary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        countSummary(scanner.nextLine());
    }

    public static void countSummary(String str) {
        int chaCount = 0;
        int numCount = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                chaCount++;
            } else if (ch >= '0' && ch <= '9') {
                numCount++;
            }
        }
        System.out.println("字符串中字母的个数为：" + chaCount);
        System.out.println("字符串中数字的个数为：" + numCount);
    }
}
