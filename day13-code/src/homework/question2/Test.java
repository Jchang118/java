package homework.question2;

public class Test {
    public static void main(String[] args) {
        User user = new User("(非法用户名)", 0);
        user.inspectTimetable();
        Teacher teacher = new Teacher("常良诚", 42, "数学");
        teacher.inspectTimetable();
        teacher.publishForm();
        Student student = new Student("周迪", 18, "高三2班");
        student.inspectTimetable();
        student.fillForm();
    }
}
