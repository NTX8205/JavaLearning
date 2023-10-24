package 練習.檔案讀取;

//createfile 新增檔案
import java.util.*;
import java.io.*;
import java.nio.file.*;
public class createtext2 {
    
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(Paths.get("scores.txt"))) {
            System.out.printf("%15s%15s%15s%15s%n", "name", "class", "total_scores", "average");
            while (sc.hasNext()) {
                try {
                    if (sc.hasNextLine()) {
                        String name = sc.next();
                        String classname = sc.next();
                        int math = sc.nextInt();
                        int java = sc.nextInt();
                        int english = sc.nextInt();
                        int total = math + java + english;
                        double average = (double) total / 3;
                        System.out.printf("%15s%15s%15d%15.1f%n", name, classname, total, average);
                    }
                } catch (NoSuchElementException N) {
                    sc.nextLine();
                }

            }

        } catch (IOException | NoSuchElementException | IllegalStateException I) {
            I.printStackTrace();
        }

    }
}
