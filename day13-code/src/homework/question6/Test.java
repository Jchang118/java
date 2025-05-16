package homework.question6;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog(3, "白色");
        Cat cat = new Cat(2, "黑色");
        Person person = new Person();
        person.keepPet(dog, "骨头");
        person.keepPet(cat, "小鱼干");
    }
}
