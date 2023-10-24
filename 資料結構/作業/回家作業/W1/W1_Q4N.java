package 資料結構.作業.回家作業.W1;

/**
 * 題目:Q4: 計算兩個正整數的最大公因數&最小公倍數
 * 
 * 
 * 
 * 日期:2022.03.16
 */

import java.util.*;

public class W1_Q4N {

    public static void main(String[] args) {

        System.out.println("計算兩個正整數的最大公因數&最小公倍數");

        Scanner sc = new Scanner(System.in);

        System.out.print("輸入2數: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        int a = x, b = y;

        int gcd = 0;
        while (a % b != 0) {
            gcd = b;
            b = a % b;
            a = gcd;
        }
        System.out.println(x + "和" + y + "的最大公因數: " + b);
        System.out.println(x + "和" + y + "的最小公倍數: " + x * y / b);

    }
}
