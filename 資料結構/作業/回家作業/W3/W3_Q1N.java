package 資料結構.作業.回家作業.W3;

/**
 * 題目:排序次序
 * 
 * 
 * 
 * 日期:2022.03.09
 */

import java.util.*;

public class W3_Q1N {

    public static void main(String[] args) {

        System.out.println("排序次序");
        Scanner sc = new Scanner(System.in);

        System.out.println("輸入範圍1~10一整數");
        int n = sc.nextInt();
        sc.close();

        if (n <= 10 && n > 0) {

            Random random = new Random();

            int[] a = new int[n];
            int[] b = new int[n];

            System.out.print("假設隨機產生的" + n + "正整數分別為: ");

            for (int i = 0; i < n; i++) {
                int ran = random.nextInt(100) + 1;
                a[i] = ran;
                b[i] = ran;
                System.out.print(a[i]);
                if (i <= n - 1) {
                    System.out.print(" ");
                }

            }

            System.out.print("\n這" + n + "個整數在排序後的索引次序為: ");

            Arrays.sort(b);

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < b.length; k++) {
                    if (a[j] == b[k]) {
                        System.out.print(k + 1);
                        b[k] = 0;
                        break;
                    }
                }
                if (j <= n - 1) {
                    System.out.print(" ");
                }
            }

        } else {
            System.out.println("輸入數超過範圍");
        }
    }

}
