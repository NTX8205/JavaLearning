package 委託.資科A班;

import java.util.Scanner;

/*
 * 製作三個函式，功能分別為計算奇數和、偶數和、整數和（其中的整數和請使用奇數和與偶數和之函式）。
 */

public class add {
    
    public static void main(String[] args) {
        System.out.print("1+2+...+n=?請輸入n=");
        Scanner input=new Scanner(System.in);
        int n = input.nextInt();
        System.out.print("請問要做奇數和(O)，偶數和(E)，還是整數和(I)?請選擇:");
        String choice=input.next();
        switch(choice){
            case "O":
                System.out.println("總合為"+odd(n));
            break;
            case "E":
                System.out.println("總合為" + even(n));
            break;
            case "I":
                System.out.println("總合為" + integer(n));
            break;
        }
        input.close();
        

    }

    // 奇數和(1+3+5+...)
    public static int odd(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==1){
                sum+=i;
            }
        }
        return sum;
    }

    // 偶數和(2+4+6+...)
    public static int even(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // 整數和(1+2+3+4+...)
    public static int integer(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
