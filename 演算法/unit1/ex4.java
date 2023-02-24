package 演算法.unit1;

import java.util.Scanner;

/**
 * 1.2.2 費式數列
 * 費式數列的定義：
 * f(0)=0; f(1)=1;
 * f(n)=f(n-1)+f(n-2) for n>=2
 * 學習重點：計算費式數列的二種演算法(recursion 遞迴版)及(iterative 版)，比較二個演算法的效能。
 */
public class ex4 {
    public static int count = 0;

    public static void main(String[] args) {
        int k;
        long result;
        Scanner in = new Scanner(System.in);
        k = in.nextInt();
        result = fi(k);
        in.close();
        System.out.println(count);
        System.out.print("f(n)=" + result);
    }

    static long fi(int n) {
        count++;
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        else
            return (fi(n - 1) + fi(n - 2));
    }
}
