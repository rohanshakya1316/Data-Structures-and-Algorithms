//abstract class Shape {
//    int a;
//    int b;
//    public Shape(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }
//
//    abstract void printArea();
//}

//class Rectangle extends Shape {
//    public Rectangle(int l, int b) {
//        super(l, b);
//    }
//
//    @Override
//    void printArea() {
//        int area = a * b;
//        System.out.println("Rectangle Area: " + area);
//    }
//}

//class Triangle extends Shape {
//    public Triangle(int base, int height) {
//        super(base, height);
//    }
//
//    @Override
//    void printArea() {
//        double area = 0.5 * a * b;
//        System.out.println("Triangle Area: " + area);
//    }
//}

//class Circle extends Shape {
//    public Circle(int radius) {
//        super(radius, 0);
//    }
//
//    @Override
//    void printArea() {
//        double area = Math.PI * Math.pow(a, 2);
//        System.out.println("Circle Area: " + area);
//    }
//}

//public class AbstractClassDemo {
//    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle(2, 3);
//        Triangle triangle = new Triangle(5, 4);
//        Circle circle = new Circle(8);
//
//        //rectangle.printArea();
//        triangle.printArea();
//       // circle.printArea();
//    }
//}
