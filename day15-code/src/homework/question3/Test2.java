package homework.question3;

public class Test2 {
    public static void main(String[] args) {
        new Fun() {
            @Override
            public void fun() {
                System.out.println("很有趣");
            }
        }.fun();
    }
}
