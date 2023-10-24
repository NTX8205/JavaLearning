package 演算法.unit5;

/*N queens 問題:首先輸入 queens 個數,依照課本的演算法:1.輸出第 2 個解,2.輸出所
有解的個數,窮舉法*/
import java.util.*;

public class unit5_2 {
    static int col[] = new int[20];
    static int n, count = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" 輸入 queens 個數:");
        n = in.nextInt();
        for (int i = 1; i <= 4; i++)
            for (int j = 1; j <= 4; j++)
                for (int k = 1; k <= 4; k++)
                    for (int l = 1; l <= 4; l++) {
                        col[1] = i;
                        col[2] = j;
                        col[3] = k;
                        col[4] = l;
                        if ((col[1] == col[2]) || (Math.abs(col[1] - col[2]) == Math.abs(1 - 2)) ||
                                (col[1] == col[3]) || (Math.abs(col[1] - col[3]) == Math.abs(1 - 3)) ||
                                (col[1] == col[4]) || (Math.abs(col[1] - col[4]) == Math.abs(1 - 4)) ||
                                (col[2] == col[3]) || (Math.abs(col[2] - col[3]) == Math.abs(2 - 3)) ||
                                (col[2] == col[4]) || (Math.abs(col[2] - col[4]) == Math.abs(2 - 4)) ||
                                (col[3] == col[4]) || (Math.abs(col[3] - col[4]) == Math.abs(3 - 4)))
                            continue;
                        count++;
                        if (count == 2) {
                            System.out.println("第" + count + "個解是:");
                            for (int m = 1; m <= n; m++)
                                System.out.println("列 " + m + "行: " + col[m]);
                        }
                    }

        System.out.println("共有 " + count + "個解");
    }
}
