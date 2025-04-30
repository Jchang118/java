package homework;

public class QuestionTwo {
    public static void main(String[] args) {
        double[] arr = {12.9, 53.54, 75.0, 3.14};
        double min = arr[0];
        for (double num : arr) {
           if (num < min) {
               min = num;
           }
        }
        System.out.println("最小值为：" + min);
    }
}
