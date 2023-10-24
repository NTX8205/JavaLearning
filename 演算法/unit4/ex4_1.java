package 演算法.unit4;

/*
 * 輸入 n 個工作所需的服務時間,算出總系統耗費時間，所謂系統耗費時間是未執行的等待時間加上服務時間,以三
 * 個工作為例，工作所需的服務時間 2 1 3, 執行順序為 1 2 3, 耗費時間為 1+(1+2)+(1+2+3)=10
 */
import java.util.*;

public class ex4_1 {
    public static void main(String args[]) {
        int i, total;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        System.out.println("輸入工作需要的服務時間:");
        for (i = 0; i < n; i++)
            s[i] = in.nextInt();
        Arrays.sort(s);
        total = 0;
        for (i = 0; i < n; i++)
            total = total + s[i] * (n - i);
        System.out.println("總系統耗費=" + total);
    }
}
