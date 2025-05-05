package homework;

public class Coder {

    private String name;
    private int id;
    private int salary;

    public Coder() {}

    public Coder(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }

    public void work() {
        System.out.println("工号为" + this.id+ "基本工资为" + this.salary + "的程序员" + this.name + "正在努力的写着代码.....");    
    }

}
