package homework;

public class Cat {
    private String color;
    private String breed;

    public Cat() {}

    public Cat(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return this.breed;    
    }

    public void eat() {
        System.out.println(this.color + "的" + this.breed + "正在吃鱼...");
    }

    public void catchMouse() {
        System.out.println(this.color + "的" + this.breed + "正在逮老鼠...");
    }
}
