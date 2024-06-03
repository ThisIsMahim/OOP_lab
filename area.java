package Mahim_210303;

abstract class Shape {
    abstract double area(); 
}
class Rectangle extends Shape {  
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    double area() {
        return length * width;
    }
}
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    double base, height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    double area() {
        return 0.5 * base * height;
    }
}
public class area {
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle(5, 4);
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(6, 8);

        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Triangle: " + triangle.area());
    }
}
