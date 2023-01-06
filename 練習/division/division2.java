package 練習.division;

//Double Division 除法

import java.util.*;

public class division2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quotient = 0;
        try {
            int int1 = sc.nextInt();
            int int2 = sc.nextInt();
            quotient = int1 / int2;
            System.out.println(quotient);
        } catch (InputMismatchException inputMismatchException) {
            System.err.println("Invalid integer!");
        } catch (ArithmeticException arithmeticException) {
            System.err.println("Can't divide by zero!");
        }
        sc.close();
    }
}
