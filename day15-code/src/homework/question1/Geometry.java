package homework.question1;

public abstract class Geometry {
    private double area;
    private double perimeter;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public abstract void calculateArea();
    public abstract void calculatePerimeter();

}
