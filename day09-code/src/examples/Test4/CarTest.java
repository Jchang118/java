package examples.Test4;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] cars = new Car[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < cars.length; i++) {
            Car c = new Car();
            System.out.println("请输入第" + (i + 1) + "辆车的品牌：");
            String brand = sc.next();
            c.setBrand(brand);
            System.out.println("请输入第" + (i + 1) + "辆车的价格：");
            int price = sc.nextInt();
            c.setPrice(price);
            System.out.println("请输入第" + (i + 1) + "辆车的颜色：");
            String color = sc.next();
            c.setColor(color);
            cars[i] = c;
        }

        for (int i = 0; i < cars.length; i++) {
            System.out.println("第" + (i + 1) + "辆车的信息为：");
            System.out.println("品牌：" + cars[i].getBrand());
            System.out.println("价格：" + cars[i].getPrice());
            System.out.println("颜色：" + cars[i].getColor());
        }
    }
}
