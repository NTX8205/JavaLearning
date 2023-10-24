package 資料結構.作業.回家作業.W2;

import java.util.Scanner;

/**
 * 題目:Q3: 質因數分解進階版
 * 
 * 
 * 
 * 日期:2022.03.02
 */

public class W2_Q3N {
    public static void main(String[] args) {

        System.out.println("質因數分解進階版");
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入一整數:");
        int n = sc.nextInt();
        sc.close();

        System.out.print(n + "=");
        for (int i = 2; n > 1; i++) {
            int count = 0;
            while (n % i == 0) {
                n /= i;
                count++;

            }
            if (count != 0) {
                if (count == 1) {
                    System.out.print(i);
                } else {
                    System.out.print(i + "^" + count);
                }
            }

            if (n != 1 && count != 0) {
                System.out.print("*");
            }
        }
    }
}
