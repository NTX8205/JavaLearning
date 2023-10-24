package 練習.division;

//Double Division 除法

import java.util.*;

class WrongInputException extends Exception {
    public WrongInputException(String s) {
        super(s);
    }
}

public class division1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println(divide(sc.nextLine(), sc.nextLine()));
            sc.close();
        } catch (NumberFormatException numberFormatException) {
            System.out.println(numberFormatException.getMessage());
        } catch (WrongInputException wrongInputException) {
            System.out.println(wrongInputException.getMessage());
        }
    }

    public static double divide(String X, String Y) throws WrongInputException {
        double x = Double.parseDouble(X);

        double y = Double.parseDouble(Y);
        if (y == 0) {
            throw new WrongInputException("Can't divide by zero!");
        }
        return x / y;

    }
}
