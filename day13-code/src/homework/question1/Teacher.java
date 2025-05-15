package homework.question1;

public class Teacher extends Employee {
    public Teacher(String id, String name, String job) {
        super(id, name, job);
    }

    @Override
    public void work() {
        super.work();
        System.out.println(this.getName() + " is a teacher");

    }
}