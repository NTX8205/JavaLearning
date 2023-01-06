package 練習.計算形狀;

import java.util.Scanner;

abstract class Circle2 {
    // private final double x = 0;
    // private final double y = 0;
    private double r;

    Circle2(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    abstract boolean inCircle(double x, double y);
}

class ChildCircle extends Circle2 {

    /* Write your code here */

    public ChildCircle(double r) {
        super(r);
    }

    boolean inCircle(double x, double y) {
        if (Math.sqrt(Math.pow((x - 0), 2) + Math.pow((y - 0), 2)) < Math.sqrt(Math.pow(getR(), 2))) {
            return true;
        } else {
            return false;
        }
    }
}

public class countingShape4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        ChildCircle rc = new ChildCircle(r);
        System.out.println(rc.inCircle(x, y));
        sc.close();
    }
}
