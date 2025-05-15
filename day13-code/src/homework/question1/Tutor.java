package homework.question1;

public class Tutor extends Teacher{
    public Tutor(String id, String name, String job) {
        super(id, name, job);
    }

    @Override
    public void work() {
        super.work();
        System.out.println(this.getName() + " provides tutoring session to students");
    }
}
