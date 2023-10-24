package 演算法.unit5;

/*輸入頂點數,以及頂點相鄰圖:1 表示有相鄰, 0 表示無相鄰,
輸出使用最少顏色數及前 10 個解之每個頂點的顏色*/
import java.util.*;

public class unit5_4 {
    static int w[][] = new int[100][100];
    static int vcolor[] = new int[100];
    static int n, m, count = 0, found = 0;;

    public static void main(String[] args) {
        int k, l;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();/* 輸入頂點數 */
        /* 輸入頂點相鄰圖:1 表示有相鄰, 0 表示無相鄰 */
        for (k = 1; k <= n; k++)
            for (l = 1; l <= n; l++)
                w[k][l] = in.nextInt();
        m = 1; /* 可以使用的顏色數 */
        while (found == 0) {
            m_coloring(0);
            m++;
        }
    }

    public static int promising(int i) {
        int j;
        int swit;
        j = 1;
        swit = 1;
        while ((j < i) && (swit == 1)) {
            if ((w[i][j] == 1) && (vcolor[i] == vcolor[j]))
                swit = 0;
            j++;
        }
        return swit;
    }

    public static void m_coloring(int i) {
        int color, k;
        if (promising(i) == 1) {
            if (i == n) {
                found = 1;
                count++;
                if (count <= 10) {
                    System.out.print("最少使用" + m + "種顏色!");
                    System.out.println("第" + count + "解是:");
                    for (k = 1; k <= n; k++)
                        System.out.print(" " + vcolor[k]);
                    System.out.println();
                }
            } else {
                for (color = 1; color <= m; color++) {
                    vcolor[i + 1] = color;
                    m_coloring(i + 1);
                }
            }
        }
    }
}