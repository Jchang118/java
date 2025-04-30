package exercise;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int x = sc.nextInt();
        int y = 1;
        while (y * y <= x) y++;
        System.out.println(y - 1);
    }
}
