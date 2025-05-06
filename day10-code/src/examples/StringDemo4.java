package examples;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        // 定义两个变量,记录正确的用户名和密码
        String rightUsername = "admin";
        String rightPassword = "123456";

        Scanner sc = new Scanner(System.in);
        // 键盘录入用户名和密码
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名:");
            String username = sc.next();
            System.out.println("请输入密码:");
            String password = sc.next();

            // 比较
            if (username.equals(rightUsername) && password.equals(rightPassword)) {
                System.out.println("登录成功");
                break;
            } else {
                if (i == 2) {
                    System.out.println("您的账户被锁定,请联系管理员");
                } else {
                    System.out.println("用户登录失败,用户名或密码错误,您还剩下" + (2 - i) + "次机会");
                }
            }
        }
    }
}
