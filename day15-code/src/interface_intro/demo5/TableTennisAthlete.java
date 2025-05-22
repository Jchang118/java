package interface_intro.demo5;

public class TableTennisAthlete extends Athlete implements Speak {
    public TableTennisAthlete() {}

    public TableTennisAthlete(int age, String name) {
        super(age, name);
    }

    @Override
    public void train() {
        System.out.println("学打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("说英语");
    }
}
