package abstract_intro.demo2;

public class Dog extends Animal {
    public Dog() {}

    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("吃骨头");
    }
}
