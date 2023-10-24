package 練習;

//Throw an Exception 年齡限制
import java.util.*;

class MyException extends Exception {
    int num;

    public MyException(String s) {
        super(s);
    }
}

public class agelimit {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            checkAge(n);
            sc.close();
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Input mismatch!");
        } catch (MyException myException) {
            System.out.println(myException.getMessage());
        }
    }

    public static void checkAge(int age) throws MyException {
        if (age < 18) {
            throw new MyException("Under 18, you are not allowed to enter!");
        } else {
            System.out.println("Legal.");
        }
    }
}
