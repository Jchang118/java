package homework.question3;

public class Test {
    public static void main(String[] args) {
        Phone p1 = new Phone("华为", 1999);
        Phone p2 = new Phone("小米", 2999);
        Phone p3 = new Phone("苹果", 9999);
        p1.call();
        System.out.println("=======================");
        p2.sendMessage();
        System.out.println("=======================");
        p3.call();
    }
}
