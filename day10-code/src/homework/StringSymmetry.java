package homework;

import java.util.Scanner;

public class StringSymmetry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        if (isStringSymmetric(input)) {
            System.out.println("The string is symmetric.");
        } else {
            System.out.println("The string is not symmetric.");
        }
    }

    public static boolean isStringSymmetric(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
