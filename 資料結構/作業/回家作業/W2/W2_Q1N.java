package 資料結構.作業.回家作業.W2;

import java.util.*;

/**
 * 題目:Q1: [p,q]區間質數問題
 * 
 * 
 * 
 * 日期:2022.03.02
 */

public class W2_Q1N {
    public static void main(String[] args) {
        System.out.println("找出p~q之間的質數及個數");
        System.out.print("輸入範圍:");
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        int end = s.nextInt();
        int count_prime = 0;

        if (start > end) {
            int temp;
            temp = start;
            start = end;
            end = temp;
        }

        s.close();

        if (start == 1) {
            System.out.println("1");
        }
        System.out.print(start + "~" + end + "之間的質數:");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                count_prime++;
                System.out.print(i + " ");
            }
        }

        System.out.println("\n質數個數:" + count_prime);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}