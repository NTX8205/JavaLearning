package 介面.unit4;

/*hw2(input file-->standard output)
1.程式功能：先從console 輸入檔案名稱(例如hw1的D:\\test.txt)，從該檔案逐筆讀入資料，再將
這些資料顯示在標準輸出(standard output)。
2.該檔案存放若干筆學生的資料紀錄，每一紀錄包含學生的學號(字串)，國文(整數)，英文(整
數)，數學(整數)，
3.再利用array，依序存放學生的資料，最後將學生資料從標準輸出印出來
4.自己練習：請嘗試利用筆記本更改test.txt內容，再執行本程式，看輸出的結果*/
import java.util.Scanner;
import java.io.*;

public class hw2 {
    public static void main(String[] args) {
        String studentname[] = new String[100];
        int student[][] = new int[100][4];
        try {
            int no = 0;
            Scanner in = new Scanner(System.in);
            String name = in.nextLine(); /* 從console輸入檔案名稱 */
            Scanner file_in = new Scanner(new File(name));
            no = 0;
            /* 從檔案逐筆讀入資料，存入array中 */
            while (file_in.hasNext()) {
                studentname[no] = file_in.next();
                for (int j = 1; j <= 3; j++)
                    student[no][j] = file_in.nextInt();
                no++;
            }
            /* 將資料從array 輸出到console */
            System.out.println("學號 國文 英文 數學");
            for (int i = 0; i < no; i++) {
                System.out.print(studentname[i] + "\t");
                for (int j = 1; j <= 3; j++)
                    System.out.print(student[i][j] + "\t");
                System.out.println();
            }
            file_in.close(); /* 記得close files */
            in.close();
        } catch (IOException ioe) {
        }
    }
}