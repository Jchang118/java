package interface_intro.demo5;

public abstract class Athlete extends Person {
    public Athlete() {}

    public Athlete(int age, String name) {
        super(age, name);
    }

    public abstract void train();
}
