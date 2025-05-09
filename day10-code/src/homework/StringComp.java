package homework;

import java.util.Scanner;

public class StringComp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();
        System.out.println(compareStrings(str1, str2));
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        if (str1.equals(str2)) return true;
        String str2x2 = str2 + str2;
        for (int i = 1; i < str1.length(); i++) {
            String subStr = str2x2.substring(i, str2.length() + i);
            if (str1.equals(subStr)) return true;
        }
        return false;
    }
}
