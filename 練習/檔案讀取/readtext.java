package 練習.檔案讀取;

//readtext 讀取檔案
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class readtext {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(Paths.get("Client.txt"))) {
            System.out.printf("%-10s%12s%12s%10s%n", "Account number", "First name", "Last name", "Balance");
            while (sc.hasNext()) {// while there is more to read
                // display record <content>
                System.out.printf("%-10d%10s%14s%12.2f%n", sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
            }

        } catch (IOException | NoSuchElementException | IllegalStateException I) {
            I.printStackTrace();
        }
    }
}
