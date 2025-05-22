package homework.question2;

public class Mobile {
    private String brand;
    private int price;

    public Mobile() {
    }

    public Mobile(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void call() {
        System.out.println("打电话");
    }

    public void sendMessage() {
        System.out.println("发信息");
    }
}
