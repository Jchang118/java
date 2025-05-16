package homework.question4;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("张三", "男", 18, "中国", "清华大学", 123456);
        Worker w1 = new Worker("李四", "女", 28, "中国", "腾讯", 3);
        StudentLeader sl1 = new StudentLeader("王武", "男", 20, "中国", "北京大学", 654321, "班长");
        s1.work();
        w1.work();
        sl1.work();
        sl1.meeting();
    }
}
