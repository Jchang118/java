package homework.question1;

public class AdminStaff extends Employee {
    public AdminStaff(String id, String name, String job) {
        super(id, name, job);
    }

    @Override
    public void work() {
        super.work();
        System.out.println(this.getName() + " is an admin staff");
    }
}
