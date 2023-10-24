package 練習.檔案讀取;

//修改檔案
import java.io.*;
import java.util.*;
public class updatefile {
    public static void main(String[] args) {
        try (Formatter output = new Formatter("scoresRecs.txt")) {

            Scanner sc = new Scanner(System.in);
            System.out.printf("%s%n%s%n", "Enter name, class, Math score, Java score, and English score",
                    "Enter end-of-file indicator <control-Z> to end input");
            output.format("%-15s %-15s %-15s %-15s %-15s %n", "name", "class", "Math score", "Java score",
                    "English score");

            while (sc.hasNext()) {

                try {
                    output.format("%-15s %-15s %-15d %-15d %-15d%n", sc.next(), sc.next(), sc.nextInt(), sc.nextInt(),
                            sc.nextInt());

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
