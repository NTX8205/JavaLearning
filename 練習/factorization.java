package 練習;

import java.util.*;
public class factorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        System.out.print(n + "=");
        while (n > 1) {
            while (n % i == 0) {
                n = n / i;
                System.out.printf("%d", i);
                if (n != 1) {
                    System.out.printf("*");
                }
            }
            i++;
        }
        sc.close();
    }
}
