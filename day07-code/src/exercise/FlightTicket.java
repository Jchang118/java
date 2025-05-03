package exercise;

import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价:");
        double originalPrice = sc.nextDouble();
        System.out.println("请输入月份: (1-12):");
        int month = sc.nextInt();
        System.out.println("请输入舱位类型,经济舱-0,头等舱-1:");
        int seatType = sc.nextInt();
        if(seatType != 0 && seatType != 1) {
            System.out.println("输入的舱位类型有误!");
            return;
        }
        if (month < 1 || month > 12) {
            System.out.println("输入的月份有误!");
            return;
        }
        System.out.println("机票的最终价格为:" + discountPriceCheck(originalPrice, month, seatType));
    }

    public static double discountPriceCheck(double originalPrice, int month, int seatType) {
        double discountedPrice = originalPrice;
        if (month >= 5 && month <= 10) {
            if (seatType == 0) {
                discountedPrice = originalPrice * 0.85;
            } else if (seatType == 1) {
                discountedPrice = originalPrice * 0.9;
            }
        } else {
            if (seatType == 0) {
                discountedPrice = originalPrice * 0.65;
            } else if (seatType == 1) {
                discountedPrice = originalPrice * 0.7;
            }
        }
        return discountedPrice;
    }
}
