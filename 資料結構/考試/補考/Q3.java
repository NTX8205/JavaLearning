package 資料結構.考試.補考;

import java.util.Scanner;

/**
 * 題目:p 至 q 封閉區間的質數搜尋
 * 
 * 
 * 
 * 日期:2022.04.15
 */

public class Q3 {
    public static void main(String[] args) {
        System.out.println("p 至 q 封閉區間的質數搜尋");

        Scanner sc = new Scanner(System.in);

        System.out.print("輸入 p 和 q (以空白隔開): ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        sc.close();

        System.out.print(p + "與" + q + "之間的質數數量為: " + countPrime(p, q));

        if (p > q) {
            int temp = p;
            p = q;
            q = temp;
        }

        int prime[] = new int[countPrime(p, q)];

        prime = Prime(prime, p, q);
        int mid = (int) Math.floor((1 + countPrime(p, q)) / 2);

        System.out.println(" , 中間質數的位置為: " + mid + " , 數字為: " + prime[mid - 1]);

    }

    public static int countPrime(int p, int q) {
        int count = 0;
        for (int i = p; i <= q; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        if (count > 0) {
            return count;
        } else {
            return 0;
        }

    }

    public static boolean isPrime(int i) {
        if (i == 1) {
            return false;
        } else {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    return false;
                }
            }
            return true;
        }

    }

    public static int[] Prime(int n[], int p, int q) {
        int idx = 0;
        for (int i = p; i <= q; i++) {
            if (isPrime(i)) {
                n[idx] = i;
                idx++;
            }
        }
        return n;
    }
}
