package 練習.檔案讀取;

//createfile 新增檔案
import java.io.*;
import java.util.*;
public class createtext1 {
    
    public static void main(String[] args) {
        try (Formatter output = new Formatter("AAA.txt")) {

            Scanner sc = new Scanner(System.in);
            System.out.printf("%s%n%s%n", "Enter account number, first name, last name and balance",
                    "Enter end-of-file indicator to end input");

            while (sc.hasNext()) {

                try {
                    output.format("%d %s %s %.2f%n", sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());

                } catch (NoSuchElementException N) {
                    System.out.println("Invalid input. Please try again.");
                    sc.nextLine();
                }

            }
            sc.close();
        }

        catch (SecurityException | FileNotFoundException | FormatterClosedException e) {
            e.printStackTrace();
        }
    }
}
