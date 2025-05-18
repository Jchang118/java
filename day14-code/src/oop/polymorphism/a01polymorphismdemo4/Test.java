package oop.polymorphism.a01polymorphismdemo4;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("老王", 30);
        Animal a1 = new Dog(2, "黑");
        Person p2 = new Person("老李", 25);
        Animal a2 = new Cat(3, "灰");

        p1.keepPet(a1, "骨头");
        System.out.println("===================================");
        p2.keepPet(a2, "鱼");
    }
}
