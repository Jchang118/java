package homework.question5;

public class ProjectManager extends Employee {
    private int bonus;

    public ProjectManager(String id, String name, int salary, int bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println(this.getName() + " (工号: " + this.getId() + ")正在作妖");
    }
}
