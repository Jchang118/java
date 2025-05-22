package interface_intro.demo5;

public class Test {
    public static void main(String[] args) {
        TableTennisAthlete tta = new TableTennisAthlete();
        TableTennisCoach ttc = new TableTennisCoach();
        tta.train();
        ttc.teach();
        tta.speak();
        ttc.speak();

        BasketballAthlete ba = new BasketballAthlete();
        BasketballCoach bc = new BasketballCoach();
        ba.train();
        bc.teach();
    }
}
