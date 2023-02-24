package 演算法.unit1;

/**
 * 1.1 演算法的主要目的是產生解決問題的逐步執行程序，考慮各種可能的方法，找出有效率的方法。
 * Algorithm 1.1 (循序搜尋法)
  Algorithm 1.2 (加總 n 個項目的總和)
  Algorithm 1-3 exchange sort : 交換排序法 :將數列從小排到大。印出每一步驟
 */
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int data[] = new int[n + 1];
        int i, j, tmp, k;
        for (i = 1; i <= n; i++)
            data[i] = in.nextInt();
        in.close();
        for (k = 1; k <= n; k++)
            System.out.print(data[k] + " ");
        System.out.println();
        /* exchange sort */
        for (i = 1; i <= n; i++) {
            for (j = i + 1; j <= n; j++)
                if (data[j] < data[i]) {
                    /* exchange data[j] with data[i] */
                    tmp = data[j];
                    data[j] = data[i];
                    data[i] = tmp;
                    for (k = 1; k <= n; k++)
                        System.out.print(data[k] + " ");
                    System.out.println();
                }
            for (k = 1; k <= n; k++)
                System.out.print(data[k] + " ");
            System.out.println();
        }
        /* end of exchange sort */
    }
}
