package examples;

import java.util.Scanner;

public class StringDemo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个整数金额:");
        String entry = sc.next();
        System.out.println(getOutput(entry));
    }

    public static String getOutput(String entry) {
        char[] convert = {'零','壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖'};
        char[] arr = {'零', '佰', '零', '拾', '零', '万', '零', '仟', '零', '佰', '零', '拾', '零', '元'};
        if (entry.length() * 2 > arr.length) {
            return "输入的金额过大";
        }
        int arrIndex = arr.length - 2;
        char ch;
        for (int i = entry.length() - 1; i >= 0; i--) {
            char num = entry.charAt(i);
            if (num >= '0' && num <= '9') {
                ch = convert[num - '0'];
                arr[arrIndex] = ch;
                arrIndex -= 2;
            } else {
                System.out.println("输入的金额有误");
            }
        }
        return new String(arr);
    }
}
