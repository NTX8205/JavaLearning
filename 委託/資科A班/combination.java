package 委託.資科A班;

/*
 * 製作階層函式，功能為計算某一正整數的階層k!。並利用該函式求出C(m,n)的值，m、n為任意正整數。
 */
import java.util.*;
public class combination {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("求排列組合C(m,n)");
        System.out.print("m = ");
        int m=input.nextInt();
        System.out.print("n = ");
        int n = input.nextInt();
        System.out.println("C("+m+","+n+")="+c(m,n));
        input.close();
    }
    //C=m!/n!(m-n)!
    public static int c(int m,int n) {
        int up=1;
        int down,down_n=1,down_m_n=1;
        int total;

        //m!
        for(int i =1;i<=m;i++){
            up*=i;
        }

        //n!
        for(int i =1;i<=n;i++){
            down_n*=i;
        }
        //(m-n)!
        for (int i = 1; i <= m-n; i++) {
            down_m_n *= i;
        }

        // C=m!/n!(m-n)!
        down=down_m_n*down_n;
        total=up/down;
        
        return total;
    }
}
