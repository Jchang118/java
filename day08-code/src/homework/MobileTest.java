package homework;

public class MobileTest {
    public static void main(String[] args) {
        Mobile xiaomi = new Mobile();
        xiaomi.setBrand("小米");
        xiaomi.setPrice(3998);
        xiaomi.setColor("黑色");
        xiaomi.call();
        xiaomi.sendMessage();
    }
}
