package OOPsConcepts.abstraction;

public class Circle {
    private double radius;
    private double pi;

    public Circle(double radius) {
        this.radius = radius;
        this.pi = 3.14;
    }

    public Circle() {
        this.radius = 0;
        this.pi = 3.14;
    }

    public double area() {
        return pi * radius * radius;
    }

    public double perimeter() {
        return 2 * pi * radius;
    }
}
