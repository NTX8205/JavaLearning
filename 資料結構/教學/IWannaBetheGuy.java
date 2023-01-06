package 資料結構.教學;

import java.util.Scanner;

public class IWannaBetheGuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int level =sc.nextInt();
        int[] arr_level = new int[level];
        for (int i = 0; i < 2; i++) {
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                int a =sc.nextInt();
                if (a <= level) {
                    arr_level[a-1]++;
                }
            }
        }
        int check = 0;
        for (int i = 0; i < arr_level.length; i++) {
            
            if(arr_level[i]==0){
                System.out.println("Oh, my keyboard!");
                break;
            } else {
                check++;
            }
        }
        if (check == level) {
            System.out.println("I become the guy.");
        }
    }
}
