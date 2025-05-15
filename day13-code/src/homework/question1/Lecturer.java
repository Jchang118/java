package homework.question1;

public class Lecturer extends Teacher{
    public Lecturer(String id, String name, String job) {
        super(id, name, job);
    }

    @Override
    public void work() {
        super.work();
        System.out.println(this.getName() + " gives lectures to students");
    }
}
