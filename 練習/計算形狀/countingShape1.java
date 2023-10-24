package 練習.計算形狀;

//計算圖形周長、體積與面積
import java.util.*;

public class countingShape1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rectangle r1 = new rectangle("blue", sc.nextDouble(), sc.nextDouble());
        square s1 = new square("yellow", sc.nextDouble());
        circle c1 = new circle("green", sc.nextDouble());
        sc.close();
        System.out.printf("The area of r1=%.1f\n", r1.calculateArea());
        System.out.printf("The perimeter of r1=%.1f\n", r1.calculatePerimeter());
        System.out.printf("The area of s1=%.1f\n", s1.calculateArea());
        System.out.printf("The area of c1=%.14f\n", c1.calculateArea());
        System.out.printf("The perimeter of c1=%.14f\n", c1.calculatePerimeter());
    }
}

class shape {
    public String color;

    public shape(String c) {
        this.color = c;
    }

    double calculateArea() {
        return calculateArea();
    }

    double calculatePerimeter() {
        return calculatePerimeter();
    }
}

class rectangle extends shape {
    public static double width;
    public static double height;

    public rectangle(String c, double width, double height) {
        super(c);
        rectangle.width = width;
        rectangle.height = height;

    }

    double calculateArea() {
        return width * height;
    }

    double calculatePerimeter() {
        return (width + height) * 2;
    }
}

class square extends rectangle {

    private double side;

    public square(String c, double side) {
        super(c, width, height);
        this.side = width;

    }

    double calculateArea() {
        return side * side;
    }
}

class circle extends shape {

    public double radius;

    public circle(String c, double radius) {
        super(c);
        this.radius = radius;
    }

    double calculateArea() {
        return radius * radius * Math.PI;
    }

    double calculatePerimeter() {
        return radius * 2 * Math.PI;
    }
}