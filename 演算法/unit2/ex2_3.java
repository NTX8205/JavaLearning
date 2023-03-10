package 演算法.unit2;

import java.util.Scanner;

/*
2.3 快速排序法(quick sort)
 基本概念：遞迴式將 array 分成二個較小的 arrays，並將這二個 arrays 分別加以排序。
 基本作法：遞迴式執行下列步驟
1. 任取一樞紐值(pivot，我們以第一個 element 為樞紐值)
2. 將此 array 分割，小於此 pivot 的 elements 放在其中一 sub array，大於此 pivot 的放在另一個 sub 
array。
3. 一直到 sub array 可以輕易排序。
 */
public class ex2_3 {
    static int[] s = new int[100];

    public static void main(String args[]) {
        int i, n, k = 1;
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            System.out.print("Round " + (k++) + ", Total number of integers n=");
            n = in.nextInt();
            System.out.println(n);
            s[0] = 0;
            for (i = 1; i <= n; i++)
                s[i] = in.nextInt();
            quicksort(1, n);
            System.out.println("The sorted list is:");
            for (i = 1; i <= n; i++)
                System.out.print(" " + s[i]);
            System.out.println();
        }
    }

    public static void quicksort(int low, int high) {
        int pivotpoint;
        if (high > low) {
            pivotpoint = partition(low, high);
            quicksort(low, pivotpoint - 1);
            quicksort(pivotpoint + 1, high);
        }
    }

    public static int partition(int low, int high) {
        int pivotpoint, i, j, pivotitem, tmp;
        pivotitem = s[low];
        j = low;
        for (i = low + 1; i <= high; i++)
            if (s[i] < pivotitem) {
                j++;
                tmp = s[i];
                s[i] = s[j];
                s[j] = tmp;
            }
        pivotpoint = j;
        /* 最後 j 的值是 pivot 位於 array 的位置 */
        tmp = s[low];
        s[low] = s[pivotpoint];
        s[pivotpoint] = tmp;
        return pivotpoint;
    }

}
