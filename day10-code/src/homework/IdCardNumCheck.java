package homework;

import java.util.Scanner;

public class IdCardNumCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入身份证号码：");
        String idCardNum = scanner.nextLine();
        if (checkIdCardNum(idCardNum)) {
            System.out.println("身份证号码格式正确");
        } else {
            System.out.println("身份证号码格式错误");
        }
    }

    public static boolean checkIdCardNum(String idCardNum) {
        char[] arr = idCardNum.toCharArray();
        if (arr.length != 18) return false;
        if (arr[0] == '0') return false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < '0' || arr[i] > '9') return false;
        }
        return arr[arr.length - 1] == 'X' || (arr[arr.length - 1] >= '0' && arr[arr.length - 1] <= '9');
    }
}
