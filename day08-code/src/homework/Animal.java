package homework;

public class Animal {
    public static void main(String[] args) {
        Cat bosimao = new Cat("花色", "波斯猫");
        Dog zangao = new Dog();
        zangao.setColor("黑色");
        zangao.setBreed("藏獒");

        bosimao.eat();
        bosimao.catchMouse();

        zangao.eat();
        zangao.lookHome();
    }

}
