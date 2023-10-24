package 資料結構.考試.補考;

import java.util.Scanner;

/**
 * 題目:質因數分解
 * 
 * 
 * 
 * 日期:2022.04.15
 */

public class Q2 {

    public static void main(String[] args) {

        System.out.println("質因數分解");

        Scanner sc = new Scanner(System.in);
        System.out.print("輸入一正整數 :");
        int n = sc.nextInt();
        sc.close();

        System.out.print(n + "的質因數分解為: ");

        for (int i = 2; n != 1; i++) {

            int count = 0;
            while (n % i == 0) {
                count++;
                n /= i;
            }
            if (count > 0) {
                if (count > 1) {
                    System.out.print(i + "^" + count);
                } else {
                    System.out.print(i);
                }
                if (n != 1) {
                    System.out.print("*");
                }

            }
        }
    }
}
