package 練習.檔案讀取;

//fileremove 移除檔案
//D:\Four\original.txt
//D:\Four\ABC\Move.txt
import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * 檔案搬移 url 格式： C:/TEMP/Phoenix.txt
 * 
 * @param url   檔案位置
 * @param toUrl 搬移至檔案位置
 */
public class fileRemove {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String move = sc.nextLine();
        fileRemove.remove(first, move);
        sc.close();
    }

    public static void remove(String first, String toUrl) {
        File file = new File(first);
        file.renameTo(new java.io.File(toUrl));
    }
}
