package staticDemo.a04staticdemo4;

public class Student {
    String name;
    int age;
    static String teacherName;

    public void show1(Student this){
        System.out.println("this: " + this);
        System.out.println(name + ", " + age + ", " + teacherName);
        this.show2();
    }

    public void show2(){
        System.out.println("show2");
    }

    public static void method() {
        System.out.println("我是静态方法");
    }
}
