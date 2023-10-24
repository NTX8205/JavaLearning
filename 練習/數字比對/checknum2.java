package 練習.數字比對;

//數字計算
import java.util.*;
public class checknum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),
                count[] = new int[10000],
                i = 0;
        sc.close();
        while (i++ < n)
            count[sc.nextInt()]++;
        for (i = 0; i < 10000; i++)
            if (count[i] > 1)
                System.out.println(i + " " + count[i]);
        
    }
}
