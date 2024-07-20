interface Shape {
    public double area();
}
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
class Rectangle implements Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return height * width;
    }
}
public class TestShape {
    public static void main(String[] args) {
        Circle c = new Circle(7);
        Rectangle r = new Rectangle(5, 9); //
        ShowArea(c);
        ShowArea(r);
    }

    public static void ShowArea(Shape s) {
        double area = s.area();
        System.out.println("The area of the shape is " + area);
    }
}
