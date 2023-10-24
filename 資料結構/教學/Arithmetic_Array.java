package 資料結構.教學;

import java.util.Scanner;

public class Arithmetic_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < testCase; i++) {
            int num = sc.nextInt();
            int[] set = new int[num];
            for (int j = 0; j < set.length; j++) {
                set[j] = sc.nextInt();
                sum+=set[j];
            }
            if (sum >= num) {
                System.out.println(sum - num);
            } else {
                System.out.println(1);
            }
            sum = 0;
        }
        sc.close();
    }
}
