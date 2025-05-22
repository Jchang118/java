package homework.question1;

public class Test {
    public static void main(String[] args) {
        Round r1 = new Round(10);
        Rectangle t1 = new Rectangle(10, 20);
        r1.calculateArea();
        r1.calculatePerimeter();
        System.out.println("半径为1的圆的面积是：" + r1.getArea() + "，周长是：" + r1.getPerimeter());
        t1.calculateArea();
        t1.calculatePerimeter();
        System.out.println("长为" + t1.getLength() + "宽为" + t1.getWidth() + "的面积是：" + t1.getArea() + "，周长是：" + t1.getPerimeter());
    }
}
