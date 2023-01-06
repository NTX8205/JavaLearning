package 練習.檔案讀取;

//deletefile
import java.io.File; // Import the File class
public class deleteFile {
    
    public static void main(String[] args) {
        File myObj = new File("output.txt");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
