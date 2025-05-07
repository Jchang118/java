package examples;

import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();

        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;
        int specialCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= '0' && ch <= '9') {
                numCount++;
            } else {
                specialCount++;
            }
        }
        System.out.println("Big Count: " + bigCount);
        System.out.println("Small Count: " + smallCount);
        System.out.println("Num Count: " + numCount);
        System.out.println("Special Count: " + specialCount);
    }
}
