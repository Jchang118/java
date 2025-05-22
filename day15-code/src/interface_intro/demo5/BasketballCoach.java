package interface_intro.demo5;

public class BasketballCoach extends Coach {
    public BasketballCoach() {}

    public BasketballCoach(int age, String name) {
        super(age, name);
    }

    @Override
    public void teach() {
        System.out.println("教打篮球");
    }

}
