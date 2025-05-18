package oop.polymorphism.a01polymorphismdemo4;

public class Animal {
    private int age;
    private String color;

    public Animal() {}

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat(String something) {
        System.out.println(this.getAge() + "岁的" + this.getColor() + "颜色的小动物在吃" + something);
    }
}
