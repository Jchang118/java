package homework.question1;

public class Round extends Geometry {
    private double radius;
    private final double PI = 3.1415926;

    public Round() {
    }

    public Round(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        setArea(PI * radius * radius);
    }

    @Override
    public void calculatePerimeter() {
        setPerimeter(2 * PI * radius);
    }
}
