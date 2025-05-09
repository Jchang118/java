package homework;

import java.util.Random;

public class RandomVerificationCode {
    public static void main(String[] args) {
        System.out.println(CodeGeneration());
    }

    public static String CodeGeneration() {
        char[] arr = new char[5];
        Random random = new Random();
        for (int i = 0; i < arr.length - 1; i++) {
            int flag = random.nextInt(2);
            if (flag == 0) {
                arr[i] = (char) (random.nextInt(26) + 'a');
            } else {
                arr[i] = (char) (random.nextInt(26) + 'A');
            }
        }
        arr[arr.length - 1] = (char) (random.nextInt(10) + '0');
        for (int j = 0; j < arr.length; j++) {
            int randomIndex = random.nextInt(arr.length);
            char temp = arr[j];
            arr[j] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        return new String(arr);
    }
}

