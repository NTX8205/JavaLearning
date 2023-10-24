package 練習;

import java.util.*;
public class countPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        point p1 = new point(sc.nextDouble(), sc.nextDouble());
        System.out.printf("%.1f\r\n", p1.distance());
        sc.close();
    }
}

class point {
    double x;
    double y;

    public point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double distance() {
        return Math.sqrt(Math.pow((x - 4), 2) + Math.pow((y - 5), 2));
    }
}