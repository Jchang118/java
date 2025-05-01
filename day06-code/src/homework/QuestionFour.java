package homework;

import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个小数: ");
        double a = sc.nextDouble();
        System.out.println(a + "的绝对值为" + abs(a));
    }

    public static double abs(double a) {
        return a < 0 ? -a : a;
    }
}
