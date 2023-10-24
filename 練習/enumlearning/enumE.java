package 練習.enumlearning;

import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Paths;
import java.util.*;
enum E {
	
	zero(1),
	negative(2),
	positive(3),
	END(4);
	
	private final int value;
	
	E(int valueOption){
		value = valueOption;
	}
	
	public int getValue() {
		return value;
	}
}
public class enumE {
    
    private final static E[] choices = E.values();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        E e = getRequest(input);

        while (e != E.END) {
            switch (e) {

                case zero:
                    System.out.printf("%nzero balances:%n");
                    break;
                case negative:
                    System.out.printf("%nnegative balancces:%n");
                    break;
                case positive:
                    System.out.printf("%npositive balances:%n");
                    break;
                default:
                    break;
            }

            readRecords(e);
            e = getRequest(input);
        }
        input.close();
    }

    private static E getRequest(Scanner input) {
        int request = 4;

        System.out.printf("%n Enter request%n%s%n%s%n%s%n%s%n", "1 - zero", "2 - negative", "3 - positive",
                "4 - Terminate program");

        try {
            do {
                System.out.printf("%n? ");
                request = input.nextInt();
            } while ((request < 1) || (request > 4));
        } catch (NoSuchElementException noSuchElementException) {
            System.err.println("Invaild input. Terminating");
        }

        return choices[request - 1];
    }

    private static void readRecords(E e) {

        try (Scanner input = new Scanner(Paths.get("clients.txt"))) {
            while (input.hasNext()) {
                int num = input.nextInt();
                double balance = input.nextDouble();

                if (shouldDisplay(e, balance)) {
                    System.out.printf("%s %s %n", num, balance);
                } else {
                    input.nextLine();
                }
            }
        } catch (NoSuchElementException | IllegalStateException | IOException Iii) {
            System.err.println("Error processing file. Terminating");
            System.exit(1);
        }
    }

    private static boolean shouldDisplay(E option, double balance) {

        if ((option == E.zero) && (balance == 0)) {
            return true;
        } else if ((option == E.negative) && (balance < 0)) {
            return true;
        } else if ((option == E.positive) && (balance > 0)) {
            return true;
        }

        return false;
    }
}
