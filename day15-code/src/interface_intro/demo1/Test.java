package interface_intro.demo1;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog(1, "小绿");
        System.out.println(f.getName() + ", " + f.getAge());

        f.eat();
        f.swim();

        Rabbit r = new Rabbit(2, "小黄");
        System.out.println(r.getName() + ", " + r.getAge());

        r.eat();
    }
}
