package 練習.檔案讀取;

//0510_FileAndDirectionInfo_3 指向檔案
import java.nio.file.*;
import java.io.IOException;
import java.util.Scanner;

public class FileAndDirectionInfo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file or Directory name");

        // create Path object based on user input
        Path path = Paths.get(sc.nextLine());

        if (Files.exists(path)) {
            System.out.printf("%n%s exists%n", path.getFileName());
            System.out.println(Files.isDirectory(path) ? "is" : "is not");
            System.out.printf("an absolute path %s%n", path.isAbsolute() ? "Is" : "Is not");
            System.out.printf("Last modfied:%s%n", Files.getLastModifiedTime(path));
            System.out.printf("%s%n", path);
            System.out.printf("%s", path.toAbsolutePath());
            if (Files.isDirectory(path)) {
                System.out.printf("%n%nDirectory content:%n");

                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);

                for (Path p : directoryStream) {
                    System.out.println(p);
                }
            }
        } else {
            System.out.printf("%s does not exist", path);
        }
        sc.close();
    }
}