package 介面.unit4;

/* unit4: hw1 (standard input --> output file)
本單元除主要參考書之外，參考:ch12, Y. Daniel Liang著，蔡志明譯，Introduction to Java
Programming, 10th edition ，Java程式設計導論第十版，碁峰出版。
1.程式主要功能：
從standard input(console) 輸入資料，寫到指定的檔案，寫入的檔案名稱可以在程式指定(例如
D:\\test.txt)或請使用者從console輸入。
將資料利用standard out輸出到螢幕及利用PrinterWriter寫入指定檔案內。
2.資料格式：
ID score1 score2 score3，ID=0000時結束。
3.請看指定的檔案(例如D:\\test.txt)是否存在，內容是否正確
4.參考輸入資料如下
D:\\test.txt
1234 78 89 90
2234 78 87 79
3234 67 89 90
4234 77 98 95
5234 86 90 89
0000
5.練習：(1)輸入不同的資料，看看寫入資料是否正確。(2)改變寫入的檔案名稱 (3)將import...
移除，看看程式編譯結果
*/
import java.util.*;
import java.io.*;

public class hw1 {
    public static void main(String[] args) {
        /* 要加入try... catch，以處理file input/output的異常情形 */
        try {
            Scanner in = new Scanner(System.in); /* 標準輸入 (standard input) */
            String name = in.nextLine();/* 從console讀入output file name */
            PrintWriter out = new PrintWriter(new File(name));
            /*
             * 或直接指定寫入的檔案名稱
             * PrintWriter out=new PrintWriter(new File("D:\\test.txt"));
             */
            String str = new String();
            while (in.hasNext()) {
                str = in.nextLine(); /* standard input */
                if (str.equals("0000"))
                    break; /* 輸入結束 */
                out.println(str); /* file output */
                System.out.println(str); /* standard output */
            }
            out.close(); /* 要記得將file close, 資料才會正確寫到檔案內 */
            in.close();
        } catch (IOException ioe) {
        }
    }
}
