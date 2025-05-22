package homework.question5;

public class Test1 {
    public static void main(String[] args) {
        A a = new A();
        a.methodA(new InterA() {
            @Override
            public void showA() {
                System.out.println("showA");
            }});
    }
}
