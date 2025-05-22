package homework.question2;

public class NewMobile extends Mobile implements IPlay {
    public NewMobile() {
    }

    public NewMobile(String brand, int price) {
        super(brand, price);
    }

    @Override
    public void play() {
        System.out.println("打王者农药");
    }
}
