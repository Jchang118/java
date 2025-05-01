package homework;

import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.print("请输入第二个整数：");
        int b = sc.nextInt();
        System.out.print("请输入第三个整数：");
        int c = sc.nextInt();
        sortPrint(a, b, c);
    }

    public static void sortPrint(int a, int b, int c) {
        int[] arr = new int[]{a, b, c};
        sortReverse(arr);
        System.out.print("从大到小的顺序是: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sortReverse(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                } else break;
            }
        }
    }
}
