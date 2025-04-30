package exercise;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你要猜的数字:");
            int guessNum = sc.nextInt();
            if (guessNum == number) {
                System.out.println("恭喜你,猜中了");
                break;
            } else if (guessNum > number) {
                System.out.println("你猜的数据" + guessNum + "大了");
            } else {
                System.out.println("你猜的数据" + guessNum + "小了");
            }
        }
    }
}
