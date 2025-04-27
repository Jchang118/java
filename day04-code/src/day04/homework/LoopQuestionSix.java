package day04.homework;

public class LoopQuestionSix {
    public static void main(String[] args) {
        int start = 2019;
        int end = 1949;
        while (start >= end) {
            System.out.println(start);
            start -= 12;
        }
    }
}
