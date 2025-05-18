package oop.polymorphism.a01polymorphismdemo4;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void keepPet(Animal animal, String something) {
        String animalName;
        if (animal instanceof Dog) {
            animalName = "狗";
        } else if (animal instanceof Cat) {
            animalName = "猫";
        } else {
            animalName = "小动物";
        }
        System.out.println("年龄为" + this.age + "岁的" + this.name + "养了一只" + animal.getColor() + "颜色的" + animal.getAge() + "岁的" + animalName);
        animal.eat(something);
        if (animal instanceof Dog d) {
            d.lookDoor();
        } else if (animal instanceof Cat c) {
            c.catchMouse();
        }
    }
}