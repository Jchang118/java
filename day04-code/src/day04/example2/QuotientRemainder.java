package day04.example2;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数:");
        int dividend = sc.nextInt();
        System.out.println("请输入除数:");
        int divisor = sc.nextInt();
        int quotient = 0;
        while (dividend >= divisor ) {
            dividend -= divisor;
            quotient++;
        }
        System.out.println("商为" + quotient + "余数为" + dividend);
   }
}
