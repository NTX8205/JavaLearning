package 練習.計算形狀;

import java.util.Scanner;

class Circle1 {
    private int radius;

    /* 你的程式碼 */
    Circle1(int r) {
        this.radius = r;
    }

    int getRadius() {
        return radius;
    }

    int getArea() {
        return radius * radius;
    }
}
public class countingShape3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        sc.close();
        Circle1 c1 = new Circle1(r);
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea() + " PI.");
    }
}
