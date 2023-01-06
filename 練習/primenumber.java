package 練習;
//找出n~m之間的質數
import java.util.Scanner;

public class primenumber {

    public static void main(String[] args) {  
        Scanner s = new Scanner(System.in);   
        int start = s.nextInt();    
        int end = s.nextInt();
        if (start == 1) {
            System.out.println("1");
        }  
            
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
        s.close();  
    }  
    public static boolean isPrime(int n) {  
        if (n <= 1) {  
            return false;  
        }  
        for (int i = 2; i <= Math.sqrt(n); i++) {  
            if (n % i == 0) {  
                return false;  
            }  
        }  
        return true;  
    }  
}
