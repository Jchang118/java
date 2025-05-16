package homework.question3;

public class Phone {
    private String brand;
    private int price;
    private static int screenSize = 6;

    public Phone() {
    }

    public Phone(String brand, int price) {
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

    public static int getScreenSize() {
        return screenSize;
    }

    public void call() {
        System.out.println("用户正在通过一部价值" + price + "元的" + brand + "手机拨打电话.");
        System.out.println("该手机屏幕尺寸为" + screenSize + "英寸.");
    }

    public void sendMessage() {
        System.out.println("用户正在通过一部价值" + price + "元的" + brand + "发送短信.");
        System.out.println("该手机屏幕尺寸为" + screenSize + "英寸.");
    }

    public void playGame() {
        System.out.println("用户正在通过一部价值" + price + "元的" + brand + "玩游戏.");
        System.out.println("该手机屏幕尺寸为" + screenSize + "英寸.");
    }
}
