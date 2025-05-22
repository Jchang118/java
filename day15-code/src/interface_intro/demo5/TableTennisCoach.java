package interface_intro.demo5;

public class TableTennisCoach extends Coach implements Speak {
    public TableTennisCoach() {}

    public TableTennisCoach(int age, String name) {
        super(age, name);
    }

    @Override
    public void teach() {
        System.out.println("教打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("说英语");
    }
}
