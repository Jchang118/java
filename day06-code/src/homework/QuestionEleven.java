package homework;

import java.util.Random;

public class QuestionEleven {
    public static void main(String[] args) {
        jackpot();
    }

    public static void jackpot() {
        int[] arr = {2, 588, 888, 1000, 10000};
        Random random = new Random();
        int numLeft = arr.length;
        while (numLeft > 0) {
            int randomIndex = random.nextInt(numLeft);
            System.out.println(arr[randomIndex] + "元的奖金被抽出");
            for (int i = randomIndex; i < numLeft - 1; i++) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            numLeft--;
        }
    }
}
