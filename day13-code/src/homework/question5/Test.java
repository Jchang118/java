package homework.question5;

public class Test {
    public static void main(String[] args) {
        ProjectManager pm = new ProjectManager("1001", "张三", 10000, 1000);
        Programmer p = new Programmer("1002", "李四", 8000);
        pm.work();
        p.work();
    }
}
