package homework.question4;

public class Outer2 {
    public static Inter method() {
        class Inner implements Inter {
            @Override
            public void show() {
                System.out.println("HelloWorld");
            }
        }
        return new Inner();
    }
}
