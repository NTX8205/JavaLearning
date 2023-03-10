package 演算法.unit2;

import java.util.Scanner;

/*
 2.2 合併排序法(merge sort)
 本課程僅考慮將二個已經排好的陣列合併(two-way merge)成一個 sorted 陣列。若同時多個
(大於 2 個)，則稱為 multi-way merge。
 合併排序法(merge sort)的主要步驟：
1. 將 1 個 n elements 的 array 分割成 2 個各有 n/2 個 elements 的 array。
2. 將較小的 array 排序(規模夠小)，否則利用 recursion 再執行 merge sort(分割成更小的
array)。
3. 將較小的二個已經 sort 好的 array 合併
 */
public class ex2_2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s1 = new int[n + 1];
        System.out.println("Total # of integers:" + n);
        // s1[0]=0;
        for (int i = 1; i <= n; i++)
            s1[i] = in.nextInt();
        System.out.println("Unsorted data:");
        for (int i = 1; i <= n; i++)
            System.out.print(" " + s1[i]);
        System.out.println();
        mergesort(n, s1);
        System.out.println("Sorted data:");
        for (int i = 1; i <= n; i++)
            System.out.print(" " + s1[i]);
        System.out.println();
    }

    public static void mergesort(int n, int s2[]) {
        if (n > 1) {
            int h = n / 2;
            int m = n - h;
            int[] u = new int[h + 1];
            int[] v = new int[m + 1];
            for (int l = 1; l <= h; l++)
                u[l] = s2[l];
            /* u[1..h]=s]1..h] */
            for (int l = (h + 1); l <= n; l++)
                v[l - h] = s2[l];
            /* v[1..m]=s[h+1..n] */
            mergesort(h, u);
            mergesort(m, v);
            merge(h, m, u, v, s2);
        }
    }

    public static void merge(int h, int m, int u[], int v[], int s3[]) {
        int i = 1, j = 1, k = 1, l;
        /*
         * i:point for u[], j:for v[],
         * k:for s3[]
         */
        while ((i <= h) && (j <= m)) {
            if (u[i] < v[j])
                s3[k] = u[i++];
            else
                s3[k] = v[j++];
            k++;
        }
        if (i > h)
            /*
             * u[]已經處理完,copy剩餘的v[]到s3[]
             */
            for (l = j; l <= m; l++)
                s3[k++] = v[l];
        else
            /*
             * v[]已經處理完,copy剩餘的u[]到s3[]
             */
            for (l = i; l <= h; l++)
                s3[k++] = u[l];
    }
}