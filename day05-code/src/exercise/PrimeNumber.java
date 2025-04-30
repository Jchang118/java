package exercise;

import java.util.Scanner;

public class PrimeNumber {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        else if (n == 2) return true;
        else if (n % 2 == 0) return false;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int n = sc.nextInt();
        if (isPrime(n)) System.out.println(n + "是素数");
        else System.out.println(n + "不是素数");
    }
}
