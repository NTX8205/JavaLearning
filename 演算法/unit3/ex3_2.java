package 演算法.unit3;

/*
 * Divide and conquer 與 Dynamic programming：同一問題利用上述二種演算法解之比較
 (algorithm 6-3(SP47)) 路徑問題(dynamic programming) :在座標上，我們從原點(0,0)出發，每次
移動只能往上↑、往右→、往右上↗，三種方向其中一種方向前進，所有路徑座標 x 恆大於等
於 y，若 x<y 則與下方的座標相同；從(0,0)到(2,2)有 6 種，從(0,0)到(3,3)有 22 種。
*/

// Divide and conquer
import java.util.*;

public class ex3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y;
        x = in.nextInt();
        y = in.nextInt();
        System.out.println(path(x, y));
    }

    static int path(int x, int y) {
        if (y == 0)
            return (1);
        else if (x < y)
            return (path(x, y - 1));
        else if (x == y)
            return (path(x - 1, y - 1) + path(x, y - 1));
        else
            return (path(x - 1, y - 1) + path(x, y - 1) + path(x - 1, y));
    }

}
