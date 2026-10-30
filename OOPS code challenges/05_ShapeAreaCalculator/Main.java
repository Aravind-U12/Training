interface Shape {
    double area();
    String name();
}

class Rectangle implements Shape {
    private final double length, width;

    public Rectangle(double length, double width) {
        if (length <= 0 || width <= 0) throw new IllegalArgumentException("Dimensions must be positive");
        this.length = length;
        this.width = width;
    }

    public double area() { return length * width; }
    public String name() { return "Rectangle"; }
}

class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        if (radius <= 0) throw new IllegalArgumentException("Radius must be positive");
        this.radius = radius;
    }

    public double area() { return Math.PI * radius * radius; }
    public String name() { return "Circle"; }
}

class Triangle implements Shape {
    private final double base, height;

    public Triangle(double base, double height) {
        if (base <= 0 || height <= 0) throw new IllegalArgumentException("Dimensions must be positive");
        this.base = base;
        this.height = height;
    }

    public double area() { return 0.5 * base * height; }
    public String name() { return "Triangle"; }
}

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Rectangle(10, 5),
            new Circle(5),
            new Triangle(10, 5)
        };

        for (Shape shape : shapes) {
            System.out.printf("%s area: %.2f%n", shape.name(), shape.area());
        }
    }
}
