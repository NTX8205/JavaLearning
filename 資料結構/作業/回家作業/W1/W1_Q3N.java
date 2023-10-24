package 資料結構.作業.回家作業.W1;

/**
 * 題目:Q3: 計算兩個正整數的最大公因數&最小公倍數
 * 
 * 
 * 
 * 日期:2022.02.23
 */

import java.util.*;

public class W1_Q3N {

    public static void main(String[] args) {

        System.out.println("計算兩個正整數的最大公因數&最小公倍數");

        Scanner sc = new Scanner(System.in);

        System.out.print("輸入2數:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        System.out.println(x + "和" + y + "的最大公因數:" + gcd(x, y));
        System.out.println(x + "和" + y + "的最小公倍數:" + lcm(x, y));

    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return gcd(b, a % b);
        }
    }
}
