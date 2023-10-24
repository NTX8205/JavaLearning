package 練習;
//公因數與公倍數
import java.util.Scanner;
public class gcd_lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int n = sc.nextInt();
        int total = 0;
        int x = i, y = n;
        while (i % n != 0) {
            total = i % n;
            i = n;
            n = total;
        }
        System.out.print(n + " " + (x * y) / n);
        sc.close();
    }
}
