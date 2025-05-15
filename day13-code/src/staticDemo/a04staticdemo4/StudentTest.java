package staticDemo.a04staticdemo4;

public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName = "王老师";

        Student s1 = new Student();
        System.out.println("s1: " + s1);
        s1.name = "小明";
        s1.age = 18;
        s1.show1();

        System.out.println("=====================");

        Student s2 = new Student();
        System.out.println("s2: " + s2);
        s2.name = "小红";
        s2.age = 19;
        s2.show1();
    }
}
