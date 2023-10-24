package 練習.division;

//Mixed Exceptions 除法(進階)
import java.util.*;

public class division3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] ary1 = new int[m];
        int[] ary2 = new int[n];
        for (int i = 0; i < ary1.length; i++) {
            ary1[i] = sc.nextInt();
        }
        for (int i = 0; i < ary2.length; i++) {
            ary2[i] = sc.nextInt();
        }
        if (n > m) {
            m = n;
        }
        for (int i = 0; i < m; i++) {
            try {
                System.out.println(divide(ary1[i], ary2[i]));
            } catch (ArithmeticException zero) {
                System.out.println(zero.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds.");
            }
        }
        sc.close();
    }

    public static int divide(int x, int y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("Can't divide a number by 0.");
        }
        return x / y;
    }
}
