package homework;

public class QuestionFive {
    public static void main(String[] args) {
        int[] arr = {72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
        double sum = 0.0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("数组元素的平均值为：" + sum / arr.length);
    }
}
