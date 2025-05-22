package homework.question5;

public class Test2 {
    public static void main(String[] args) {
        class B implements InterA {
            @Override
            public void showA() {
                System.out.println("showA");
            }
        }
        A a = new A();
        a.methodA(new B());
    }
}
