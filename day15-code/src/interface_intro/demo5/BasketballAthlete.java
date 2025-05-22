package interface_intro.demo5;

public class BasketballAthlete extends Athlete {
    public BasketballAthlete() {}

    public BasketballAthlete(int age, String name) {
        super(age, name);
    }

    @Override
    public void train() {
        System.out.println("学打篮球");
    }
}
