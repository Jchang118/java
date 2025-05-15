package homework.question2;

public class Student extends User {
    private String gradeClass;

    public String getGradeClass() {
        return gradeClass;
    }

    public void setGradeClass(String gradeClass) {
        this.gradeClass = gradeClass;
    }

    public Student(String name, int age, String gradeClass) {
        super(name, age);
        this.gradeClass = gradeClass;
    }

    @Override
    public void inspectTimetable() {
        System.out.println(getGradeClass() + getName() + "同学正在查询课表.");
    }

    public void fillForm() {
        System.out.println(getGradeClass() + getName() + "同学正在填写听课反馈.");
    }
}
