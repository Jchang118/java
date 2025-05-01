package homework;

import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个小数:");
        double num1 = sc.nextDouble();
        System.out.println("请输入第二个小数:");
        double num2 = sc.nextDouble();
        System.out.println(min(num1, num2) + "是较小的数");
    }

    public static double min(double num1, double num2) {
        if (num1 > num2) return num2;
        return num1;
    }
}
