package homework;

public class Mobile {
    private String brand;
    private int price;
    private String color;

    public Mobile() {}

    public Mobile(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public String getBrand() {
        return this.brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public int getPrice() {
        return this.price;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void call() {
        System.out.println("正在使用价格为" + this.price + "元" + this.color + "的" + this.brand + "手机打电话...");
    }

    public void sendMessage() {
        System.out.println("正在使用价格为" + this.price + "元" + this.color + "的" + this.brand + "手机发短信...");
    }    
}
