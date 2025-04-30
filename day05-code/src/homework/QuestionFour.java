package homework;

public class QuestionFour {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 4};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += (int) (arr[i] * Math.pow(10, arr.length - i - 1));
        }
        System.out.println(sum);
    }
}
