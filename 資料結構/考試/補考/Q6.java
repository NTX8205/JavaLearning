package 資料結構.考試.補考;

import java.util.Scanner;

/**
 * 題目:三個整數的最大公因數及最小公倍數[需使用陣列解題]
 * 
 * 
 * 
 * 日期:2022.04.15
 */

public class Q6 {

    public static void main(String[] args) {

        System.out.println("三個整數的最大公因數及最小公倍數[需使用陣列解題]");

        Scanner sc = new Scanner(System.in);

        System.out.print("輸入三個數(以空白隔開) :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        sc.close();

        showPrime(x);
        showPrime(y);
        showPrime(z);

        // gcd(x,y,z);
        // lcm(x,y,z);
    }

    public static void showPrime(int num) {

        int[] n = new int[countprime(num)];
        n = prime(num, n);

        System.out.print(num + "的質因數分解為: ");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]);
            if (i != n.length - 1) {
                System.out.print("*");
            }
        }
        System.out.println();
    }

    public static int countprime(int n) {

        int countNum = 0;

        for (int i = 2; n != 1; i++) {

            while (n % i == 0) {
                countNum++;
                n /= i;
            }
        }

        if (countNum > 0) {
            return countNum;
        } else {
            return 0;
        }

    }

    public static int[] prime(int n, int[] nums) {

        int index = 0;
        for (int i = 2; n != 1; i++) {

            while (n % i == 0) {
                nums[index] = i;
                n /= i;
                index++;
            }
        }

        return nums;
    }

    public static void gcd(int x, int y, int z) {
        int[] x_prime = new int[countprime(x)];
        x_prime = prime(x, x_prime);
        int[] y_prime = new int[countprime(y)];
        y_prime = prime(y, y_prime);
        int[] z_prime = new int[countprime(z)];
        z_prime = prime(z, z_prime);

    }

    public static void lcm(int x, int y, int z) {

    }
}
