package 練習.計算形狀;

import java.util.Scanner;
public class countingShape2 {
    public static void main(String args[]) {
        TwoDShape shapes[] = new TwoDShape[2];
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        sc.close();
        shapes[0] = new Triangle1(w, h);
        shapes[1] = new Rectangle1(w, h);

        for (TwoDShape obj : shapes)
            System.out.println("The area of the " + obj.getName() + " is " + obj.area());
    }
}

abstract class TwoDShape {
    private double width;
    private double height;
    private String name;

    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    String getName() {
        return name;
    }

    abstract double area();
}

class Triangle1 extends TwoDShape {
    Triangle1(double w, double h) {
        super(w, h, "triangle");
    }

    /* 你的程式碼 */
    double area() {
        return (getWidth() * getHeight()) / 2;
    }

}

class Rectangle1 extends TwoDShape {
    Rectangle1(double w, double h) {
        super(w, h, (w == h) ? "square" : "rectangle");
    }

    /* 你的程式碼 */
    double area() {
        return (getWidth() * getHeight());
    }
}
