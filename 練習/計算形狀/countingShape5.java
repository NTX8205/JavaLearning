package 練習.計算形狀;

import java.util.Scanner;
public class countingShape5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        sc.close();
        threeDShape cylinder = new cylinder(r, h);
        threeDShape cone = new cone(r, h);
        System.out.printf("%.2f\r\n", cone.volume());
        System.out.printf("%.2f\r\n", cylinder.volume());
    }
}

abstract class threeDShape {

    private double radius, height;

    threeDShape(double radius, double height) {
        this.height = height;
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    double getHeight() {
        return height;
    }

    abstract double volume();

}

class cylinder extends threeDShape {
    public cylinder(double r, double h) {
        super(r, h);

    }

    public double volume() {

        return getRadius() * getRadius() * getHeight() * Math.PI;
    }
}

class cone extends threeDShape {

    public cone(double r, double h) {
        super(r, h);
    }

    public double volume() {
        return getRadius() * getRadius() * getHeight() * Math.PI / 3;
    }
}