package homework.question6;

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

    public void keepPet(Dog dog, String food){
        System.out.println("颜色为"+dog.getColor()+"的" + dog.getAge() +"岁的狗, 在吃" + food);
    }

    public void keepPet(Cat cat, String food){
        System.out.println("颜色为"+cat.getColor()+"的" + cat.getAge() +"岁的猫, 在吃" + food);
    }
}
