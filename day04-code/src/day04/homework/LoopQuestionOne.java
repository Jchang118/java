package day04.homework;

import java.util.Scanner;

public class LoopQuestionOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个数字:");
        int num2 = scanner.nextInt();
        int start = num1 < num2 ? num1 : num2;
        int end = num1 > num2 ? num1 : num2;
        int result = 0;
        for (int i = start; i <= end; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
