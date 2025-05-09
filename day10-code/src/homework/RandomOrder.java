package homework;

import java.util.Random;
import java.util.Scanner;

public class RandomOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        System.out.println(randomOrder(scanner.nextLine()));
    }

    public static String randomOrder(String str) {
        Random random = new Random();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = random.nextInt(arr.length);
            char temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        return new String(arr);
    }
}

