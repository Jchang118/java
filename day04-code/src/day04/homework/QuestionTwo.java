package day04.homework;

import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数:");
        int b = sc.nextInt();
        System.out.println("请输入第三个整数:");
        int c = sc.nextInt();
        System.out.println("最小值为: " + (c < (a < b ? a : b) ? c : (a < b? a : b)));
    }
}