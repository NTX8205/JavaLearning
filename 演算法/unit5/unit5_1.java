package 演算法.unit5;

/*照課本的演算法:1. 輸出第 2 個解,2. 輸出所 有解的個數*/

/* 回朔法 */
import java.util.*;

public class unit5_1 {
    static int col[] = new int[20];
    static int n, count = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" 輸入 queens 個數:");
        n = in.nextInt();
        queens(0);
        System.out.println("共有 " + count + "個解");
    }

    public static boolean promising(int i) {
        int k;
        k = 1;
        boolean swit = true;
        while ((k < i) && (swit == true)) {
            if ((col[i] == col[k]) ||
                    ((col[i] - col[k]) == (i - k)) ||
                    ((col[i] - col[k]) == (k - i)))
                swit = false;
            k++;
        }
        return swit;
    }

    public static void queens(int i) {
        int j, k;
        if (promising(i)) {
            if (i == n) {
                count++;
                if (count == 2) {
                    System.out.println("第 2 個解是:");
                    for (k = 1; k <= n; k++)
                        System.out.println("列 " + k + "行: " + col[k]);
                }
            } else {
                for (j = 1; j <= n; j++) {
                    col[i + 1] = j;
                    queens(i + 1);
                }
            }
        }
    }
}