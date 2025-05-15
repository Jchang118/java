package oppExtends.oppExtendsDemo1;

public class Animal {
    // 权限修饰符如果写了private，子类中是无法访问的
    public void eat() {
        System.out.println("吃东西");
    }
    public void drink() {
        System.out.println("喝水");
    }
}

