package day04.homework;

import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入客户类别(0-普通客户, 1-VIP客户):");
        byte customerType = sc.nextByte();
        System.out.println("请输入商品价格:");
        double tagPrice = sc.nextDouble();
        double discount = 1;
        if (customerType == 0 && tagPrice >= 100) {
                discount = 0.9;
        } else if (customerType == 1) {
            if (tagPrice < 200) {
                discount = 0.8;
            } else {
                discount = 0.75;
            }
        }
        System.out.printf("应付金额为%.2f元\n", tagPrice * discount);
    }
}
