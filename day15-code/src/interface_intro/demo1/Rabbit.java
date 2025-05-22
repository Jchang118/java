package interface_intro.demo1;

public class Rabbit extends Animal {
    public Rabbit() {
    }

    public Rabbit(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("兔子在吃胡萝卜");
    }
}
