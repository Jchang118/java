package homework.question1;

public class Maintainer extends AdminStaff {
    public Maintainer(String id, String name, String job) {
        super(id, name, job);
    }

    @Override
    public void work() {
        super.work();
        System.out.println(this.getName() + " is responsible for maintenance work");
    }
}
