package homework;

import java.util.Scanner;

public class Day10Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String str = sc.nextLine();
        System.out.println("请输入单词:");
        String word = sc.nextLine();
        System.out.println("单词" + word + "在字符串中出现了" + wordCount(str, word) + "次");
    }

    public static int wordCount(String str, String word) {
        int count = 0;
        int index;
        while ((index = str.indexOf(word)) != -1) {
            count++;
            str = str.substring(index + word.length());
        }
        return count;
    }
}
