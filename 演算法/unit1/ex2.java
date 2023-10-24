/*
(2).矩陣乘法
algorithm 1.4：(p.9)二個矩陣相乘：A(m*n)及 B(n*k)，輸入 m，n，k 及矩陣(A 及 B),將 C(m*k)=A(m*n)x B(n*k)印出來*/
package 演算法.unit1;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, j, l;
        int m = in.nextInt();
        int n = in.nextInt();
        int k = in.nextInt();
        int a[][] = new int[m + 1][n + 1];
        int b[][] = new int[n + 1][k + 1];
        int c[][] = new int[m + 1][k + 1];
        for (i = 1; i <= m; i++)
            for (j = 1; j <= n; j++)
                a[i][j] = in.nextInt();
        for (i = 1; i <= n; i++)
            for (j = 1; j <= k; j++)
                b[i][j] = in.nextInt();
        in.close();
        /* matrix mult*/
        for (i = 1; i <= m; i++)
            for (j = 1; j <= k; j++) {
                c[i][j] = 0;
                for (l = 1; l <= n; l++)
                    c[i][j] = c[i][j] + a[i][l] * b[l][j];
            }
        /* end of matrix mult */
        /* print the result */
        for (i = 1; i <= m; i++) {
            for (j = 1; j <= k; j++)
                System.out.print(c[i][j] + " ");
            System.out.println();
        }
    }
}
