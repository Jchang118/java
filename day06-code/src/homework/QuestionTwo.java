package homework;

import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();
        System.out.println("请输入第三个整数：");
        int c = sc.nextInt();
        System.out.println(max(a,b,c) + "三个数中最大的");
    }

    public static int max(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}
