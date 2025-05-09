package homework;

import java.util.Scanner;
import java.util.StringJoiner;

public class RomanNumerals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.println("请输入一个长度小于9的数字字符串:");
            input = scanner.next();
            if (input.length() > 9) {
                System.out.println("输入的数字字符串长度大于9，请重新输入");
                continue;
            }
            boolean flag = true;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) < '0' || input.charAt(i) > '9' ) {
                    System.out.println("输入的数字字符串包含非数字字符，请重新输入");
                    flag = false;
                    break;
                }
            }
            if (flag) break;
        }
        System.out.println(intToRoman(input));
    }

    public static String intToRoman(String s) {
        int[] nums = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            nums[i] = s.charAt(i) - '0';
        }
        String[] roman = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        StringJoiner sj = new StringJoiner(" ");
        for (int num : nums) {
            if (num != 0) {
                sj.add(roman[num]);
            }
        }
        return sj.toString();
    }
}
