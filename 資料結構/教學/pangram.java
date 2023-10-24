package 資料結構.教學;

import java.util.Scanner;

public class pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]abc = new int[26];
        int n = sc.nextInt();
        String s = sc.next().toLowerCase();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(c >= 'a' && c <='z'){
                abc[c - 'a']++;
            }
        }
        int check = 0;
        for (int i = 0; i < abc.length; i++) {
            if(abc[i] > 0){
                check++;
            }
        }
        if (check == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
