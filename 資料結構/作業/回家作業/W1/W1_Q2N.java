package 資料結構.作業.回家作業.W1;

/**
 * 題目:Q2: 將使用者輸入的正整進行質因數分解
 * 
 * 
 * 
 * 日期:2022.02.23
 */

import java.util.*;

public class W1_Q2N {

    public static void main(String[] args) {

        System.out.println("正整數進行質因數分解");

        System.out.print("輸入整數:");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.print(n + "=");

        for (int i = 2; n > 1; i++) {
            while (n % i == 0) {
                n = n / i;
                System.out.printf("%d", i);
                if (n != 1) {
                    System.out.printf("*");
                }
            }
        }
    }
}
