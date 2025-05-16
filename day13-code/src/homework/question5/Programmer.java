package homework.question5;

public class Programmer extends Employee {
    public Programmer(String id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println(this.getName() + " (工号: " + this.getId() + ")正在改bug");
    }
}
