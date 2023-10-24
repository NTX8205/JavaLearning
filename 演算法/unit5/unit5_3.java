package 演算法.unit5;

import java.util.*;

public class unit5_3 {
    static int include[] = new int[100];
    static int w[] = new int[100];
    static int n, total_w, total = 0;

    public static void main(String[] args) {
        int i;
        Scanner in = new Scanner(System.in);
        System.out.println("輸入物件個數及總重量限制:");
        n = in.nextInt();
        total_w = in.nextInt();
        System.out.println("輸入個別物件重量:");
        for (i = 1; i <= n; i++) {
            w[i] = in.nextInt();
            total = total + w[i];
        }
        sum_of_subsets(0, 0, total);
    }

    public static void sum_of_subsets(int i, int weight, int total) {
        int j, k;
        if (((weight + total) >= total_w) && ((weight == total_w) || ((weight + w[i + 1]) <= total_w))) {
            if (weight == total_w) {
                for (k = 1; k <= i; k++)
                    if (include[k] == 1)
                        System.out.print(" " + w[k]);
                System.out.println();
            } else {
                include[i + 1] = 1;
                sum_of_subsets(i + 1, weight + w[i + 1], total - w[i + 1]);
                include[i + 1] = 0;
                sum_of_subsets(i + 1, weight, total - w[i + 1]);
            }
        }
    }
}
