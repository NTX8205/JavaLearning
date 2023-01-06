package 資料結構.教學;

import java.util.Scanner;

public class Odd_Set {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int num = sc.nextInt();
            int a = 0, b = 0;
            int[] muitset = new int[2*num];
            for (int j = 0; j < muitset.length; j++) {
                muitset[j] = sc.nextInt();
                if (muitset[j] % 2 == 0) {
                    a++;
                } else {
                    b++;
                }
            }
            if (a == b) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        sc.close();
    }
}
