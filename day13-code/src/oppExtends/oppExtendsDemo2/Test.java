package oppExtends.oppExtendsDemo2;

public class Test {
    public static void main(String[] args) {
        // 利用空参构造创建子类对象
        // Zi z1 = new Zi(); <--出错因为子类里面有一个有参构造,但是没有空参构造

        // 利用有参构造创建子类对象
        Zi z2 = new Zi("jack", 20);
    }
}

class Fu {
    String name;
    int age;

    public Fu() {}
    public Fu(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Zi extends Fu {
    // 如果一个类中没又构造方法,虚拟机会自动添加一个
    public Zi(String jack, int i) {
    }
}