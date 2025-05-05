package homework;

public class Girlfriend {
    private String name;
    private double height;
    private double weight;

    public Girlfriend() {}

    public Girlfriend(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void show() {
        System.out.println("我女朋友叫" + this.name + "，身高" + this.height + "厘米，体重" + this.weight + "斤");
    }

    public void wash() {
        System.out.println("女朋友帮我洗衣服");
    }

    public void cook() {
        System.out.println("女朋友帮我做饭");
    }    
}
