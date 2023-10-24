package 介面.unit4;

/*hw3： input file1-> array(處理資料) ->output file2
主要功能： 從console輸入 (讀入檔案名稱)及(寫出的檔案名稱)， 從輸入檔案逐筆讀入學生
資料，放入array中，處理完資料(算出平均成績)，再將資料從array寫到指定的輸出檔案
自己練習：
1. 處理資料方式改為算出每一位同學成績的最高分，寫到另外一個file中 */
import java.util.Scanner;
import java.io.*;

public class hw3 {
    public static void main(String[] args) {
        String studentname[] = new String[100];
        int student[][] = new int[100][4];
        try {
            int no = 0;
            Scanner in = new Scanner(System.in);
            Scanner file_in = new Scanner(new File(in.nextLine()));/* 從console 輸入input file name */
            PrintWriter file_out = new PrintWriter(new File(in.nextLine()));/*
                                                                             * 從console 輸入output
                                                                             * file name
                                                                             */
            /* 逐筆讀入資料到array */
            no = 0;
            while (file_in.hasNext()) {
                studentname[no] = file_in.next();
                for (int j = 1; j <= 3; j++)
                    student[no][j] = file_in.nextInt();
                no++;
            }
            /* 算出平均成績，並寫入檔案 */
            file_out.println("學號\t國文\t英文\t數學\t平均");
            for (int i = 0; i < no; i++) {
                file_out.print(studentname[i] + "\t");
                for (int j = 1; j <= 3; j++)
                    file_out.print(student[i][j] + "\t");
                file_out.println((student[i][1] + student[i][2] + student[i][3]) / 3);
            }
            file_in.close();
            in.close();
            file_out.close();
        } catch (IOException ioe) {
            System.out.println("file not found");
        }
    }
}
