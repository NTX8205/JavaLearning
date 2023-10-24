package 演算法.unit3;
/*
 * Divide and conquer 與 Dynamic programming：同一問題利用上述二種演算法解之比較
 (algorithm 6-3(SP47)) 路徑問題(dynamic programming) :在座標上，我們從原點(0,0)出發，每次
移動只能往上↑、往右→、往右上↗，三種方向其中一種方向前進，所有路徑座標 x 恆大於等
於 y，若 x<y 則與下方的座標相同；從(0,0)到(2,2)有 6 種，從(0,0)到(3,3)有 22 種。
*/

// Dynamic programming
import java.util.*;

public class ex3_3 {
    public static void main(String[] args) {
        int x, y, i, j;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        int data[][] = new int[x + 1][y + 1];
        for (i = 0; i <= x; i++)
            for (j = 0; j <= y; j++)
                data[i][j] = 0;
        for (i = 0; i <= x; i++)
            data[i][0] = 1;
        for (i = 1; i <= x; i++)
            for (j = 1; j <= y; j++) {
                if (i < j)
                    data[i][j] = data[i][j - 1];
                else if (i == j)
                    data[i][j] = data[i - 1][j - 1] + data[i][j - 1];
                else
                    data[i][j] = data[i - 1][j - 1] + data[i][j - 1] + data[i - 1][j];
            }
        System.out.println(data[x][y]);
    }
}
