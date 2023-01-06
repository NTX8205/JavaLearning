package 委託.資科B班;
/*
3.	寫一個JAVA程式，製作階層計算機，輸入某一正整數k計算k!，輸入exit離開階層計算機（請利用函式）。
*/

import java.util.*;

public class findfactorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("輸入一個整數，求該數的階乘。");
        System.out.println("輸入exit，退出計算機。");

        while(true){
            String num=sc.next();
            try {
                
                if(num.equals("exit")){
                    break;
                }
                int number=Integer.parseInt(num);

                System.out.println(number+"的階乘 : "+factorial(number));
            } 
            catch (Exception e) {

                System.out.println("請勿輸入非數字及exit以外之符號");
            }
            
        }
        sc.close();
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        else if(n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}
