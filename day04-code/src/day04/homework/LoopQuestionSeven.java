package day04.homework;

public class LoopQuestionSeven {
    public static void main(String[] args) {
        int start = 1988;
        int end = 2019;
        for (; start <= end; start++) {
            if (start % 4 == 0 && start % 100 != 0) {
                System.out.println(start);
            }
            if (start % 400 == 0) {
                System.out.println(start);
            }
        }
    }
}
