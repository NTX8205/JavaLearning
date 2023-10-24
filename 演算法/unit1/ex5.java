package 演算法.unit1;
/*
 *  iterative 費式數列：完成 1-7(演算法 1.7)iterative 費式數列。

 */
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        int n, i;
        int f[] = new int[100];
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        f[0] = 0;
        if (n > 1) {
            f[1] = 1;
            for (i = 2; i <= n; i++)
                f[i] = f[i - 1] + f[i - 2];
        }
        System.out.print(f[n]);
        in.close();
    }
}
