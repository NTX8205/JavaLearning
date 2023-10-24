package 資料結構.作業.回家作業.W2;

/**
 * 題目:Q2: 最接近質數問題
 * 
 * 
 * 
 * 日期:2022.03.02
 */

import java.util.*;

public class W2_Q2N {
    public static void main(String[] args) {
        System.out.println("找出與n最接近的質數");

        Scanner sc = new Scanner(System.in);

        System.out.print("輸入整數:");
        int n = sc.nextInt();
        sc.close();
        int fprime = 0, bprime = 0;

        for (int forward = n + 1; forward < Integer.MAX_VALUE; forward++) {
            if (isPrime(forward)) {
                fprime = forward;
                break;
            }
        }
        for (int backward = n - 1; backward > 0; backward--) {
            if (isPrime(backward)) {
                bprime = backward;
                break;
            }
        }

        if (n - bprime > fprime - n) {
            System.out.println("最接近" + n + "的質數:" + fprime);
        } else if (n - bprime < fprime - n) {
            System.out.println("最接近" + n + "的質數:" + bprime);
        } else if (n - bprime == fprime - n) {
            System.out.println("最接近" + n + "的質數:" + bprime + " " + fprime);
        }
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
