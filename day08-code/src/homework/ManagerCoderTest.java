package homework;

public class ManagerCoderTest {
    public static void main(String[] args) {
        Manager zhangsan = new Manager("张三", 123, 15000, 6000);
        Coder lisi = new Coder();
        lisi.setName("李四");
        lisi.setId(135);
        lisi.setSalary(10000);
        zhangsan.work();
        lisi.work();
    }

}
