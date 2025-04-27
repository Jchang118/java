package day04.homework;

import java.util.Scanner;

public class SwitchQuestionOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int a = scanner.nextInt();
        System.out.println("请输入第二个整数:");
        int b = scanner.nextInt();
        System.out.println("请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法):");
        int operator = scanner.nextInt();
        switch (operator) {
            case 1 -> {
                System.out.println(a + "+" + b + "=" + (a + b));
            }
            case 2 -> {
                System.out.println(a + "-" + b + "=" + (a - b));
            }
            case 3 -> {
                System.out.println(a + "*" + b + "=" + (a * b));
            }
            case 4 -> {
                System.out.println(a + "/" + b + "=" + (a * 1.0 / b));
            }
        }
    }
}
