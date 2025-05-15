package homework.question1;

public class Buyer extends AdminStaff {
    public Buyer(String id, String name, String job) {
        super(id, name, job);
    }

    @Override
    public void work() {
        super.work();
        System.out.println(this.getName() + " is responsible for purchasing goods");
    }
}
