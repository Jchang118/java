package homework.question2;

public class Teacher extends User {
    private String department;

    public Teacher(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void inspectTimetable() {
        System.out.println(getDepartment() + "老师" + getName() + "正在查询课表.");
    }

    public void publishForm() {
        System.out.println(getDepartment() + "老师" + getName() + "正在发布问题.");
    }


}
