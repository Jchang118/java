package abstract_intro.demo2;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog(1, "小绿");
        System.out.println(f.getName() + ", " + f.getAge());

        f.drink();
        f.eat();
    }
}
