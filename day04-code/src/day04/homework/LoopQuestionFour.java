package day04.homework;

import java.util.Scanner;

public class LoopQuestionFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        String numStr = sc.nextLine();
        for (int i = 0; i < numStr.length() / 2; i++) {
            if (numStr.charAt(i) != numStr.charAt(numStr.length() - i - 1)) {
                System.out.println("不是回文数");
                return;
            }
        }
        System.out.println("是回文数");
    }
}
