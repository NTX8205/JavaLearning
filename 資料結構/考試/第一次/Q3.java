package 資料結構.考試.第一次;

// Q3：p 至 q 封閉區間的質數搜尋
// 
// 
// 

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("p 至 q 封閉區間的質數搜尋");
        Scanner sc = new Scanner(System.in);

        System.out.print("輸入p 與 q : ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        sc.close();

        if (p > q) {
            int temp;
            temp = p;
            p = q;
            q = temp;
        }
        if (p >= 1 && q <= 1000) {
            int[] num = new int[countPrime(p, q)];
            int temp = 0;
            for (int i = p; i <= q; i++) {
                if (isPrime(i)) {
                    num[temp] = i;
                    temp++;
                }
            }
            int count = countPrime(p, q);
            int mid = (int) Math.floor((double) (1 + count) / 2);
            System.out.println(p + "到" + q);
            System.out.println("質數總數:" + count);
            System.out.println("最小質數:" + num[0] + " 中間質數:" + num[mid - 1] + " 最大質數:" + num[count - 1]);
        } else {
            System.out.println("p或q的數字範圍錯誤(p>=1,q<=1000)");
        }

    }

    public static int countPrime(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        } else {
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                return true;
            } else {
                return false;
            }
        }

    }
}
