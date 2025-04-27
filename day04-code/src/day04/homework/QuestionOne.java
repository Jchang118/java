package day04.homework;

public class QuestionOne {
    public static void main(String[] args) {
        double price = 7988;
        double secondValue = 1500;
        double tradeIn = price * 0.8;
        double sellToPrivate = price - secondValue;
        if (sellToPrivate > tradeIn) {
            System.out.println("我建议以旧换新");
        } else {
            System.out.println("我建议卖二手市场");
        }
    }
}
