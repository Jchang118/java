package day04.homework;

import java.util.Scanner;

public class LoopQuestionTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个数字:");
        int num2 = scanner.nextInt();
        int start = num1 < num2 ? num1 : num2;
        int end = num1 > num2 ? num1 : num2;
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
