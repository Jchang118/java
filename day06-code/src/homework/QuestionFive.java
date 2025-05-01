package homework;

import java.util.Scanner;

public class QuestionFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个正整数: ");
        int n = sc.nextInt();
        System.out.println(n + "是" + digitSum(n) + "位数字");
    }

    public static int digitSum(int n) {
        int digits = 1;
        while (n / 10 > 0) {
            n /= 10;
            digits++;
        }
        return digits;
    }
}
