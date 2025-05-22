package homework.question1;

public class Rectangle extends Geometry {
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void calculateArea() {
        setArea(length * width);
    }

    @Override
    public void calculatePerimeter() {
        setPerimeter(2 * (length + width));
    }
}
