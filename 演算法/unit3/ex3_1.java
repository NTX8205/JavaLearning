package 演算法.unit3;

/*
 * 比較計算 (
10
3
) 二種演算法所需計算
1. 使用 divide and conquer (recursion)計算二項式係數 ，
共需要2 ∗ (
10
3
) − 1=2*10*9*8/3*2-1=10*8*3-1 次計算
2. 使用 array 計算二項式係數：需要 10*3=30 計算

 */

import java.util.*;

class Binomial {
    // This is a recursive function.不可更改
    int bcR(int n, int k) {
        if ((k == 0) || (n == k))
            return 1;
        else
            return (bcR(n - 1, k - 1) + bcR(n - 1, k));
    }

    // This is an iterative equivalent.不可更改
    int bcI(int n, int k) {
        int i, j;
        int[][] b = new int[100][100];
        for (i = 0; i <= n; i++)
            for (j = 0; j <= Math.min(i, k); j++)
                if ((j == 0) || (j == i))
                    b[i][j] = 1;
                else
                    b[i][j] = b[i - 1][j - 1] + b[i - 1][j];
        return b[n][k];
    }
}
public class ex3_1 {
    public static void main(String args[]) {
        Binomial f = new Binomial();
        Scanner scan = new Scanner(System.in);
        int n, k;
        n = scan.nextInt();
        k = scan.nextInt();
        while ((n > 0) && (k > 0)) {
            System.out.println("Binomial Coefficient (recursive)");
            System.out.println("(" + n + ", " + k + ") is " + f.bcR(n, k));
            System.out.println();
            System.out.println("Binomial Coefficient (iterative)");
            System.out.println("(" + n + ", " + k + ") is " + f.bcI(n, k));
            n = scan.nextInt();
            k = scan.nextInt();
        }
    }

}
