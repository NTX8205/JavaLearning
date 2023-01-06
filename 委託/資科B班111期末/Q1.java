package 委託.資科B班111期末;

/*
 * 目 1: 統計檔案內某字串出現次數 (20%)
 * 說明: 讀取老師所提供的檔案, 請統計檔案內英文字母 e 和 to 分別出現的總次數
 * 檔案位置: https://reurl.cc/2Za06a
 */

import java.io.*;
import java.nio.file.*;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        //讀取檔案(路徑請自行更改)
        //相對路徑 : School_project\\委託\\資科B班111期末\\article.txt
        //絕對路徑 : C:\\Users\\User\\OneDrive\\文件\\GitHub\\School_project\\委託\\資科B班111期末\\article.txt
        try (Scanner input = new Scanner(Paths.get("School_project\\委託\\資科B班111期末\\article.txt"))){
            int count_e = 0;
            int count_to = 0;
            while(input.hasNext()){
                //將文章裡的單字個別儲存
                String word = input.next();
                //尋找單字裡是否有e
                if(word.indexOf("e") != -1){
                    //詳細檢查單字裡的所有e
                    for (int i = 0; i < word.length(); i++) {
                        char c = word.charAt(i);
                        if(c == 'e'){
                            count_e++;
                        }
                    }
                }
                // 尋找單字裡是否有to
                if (word.indexOf("to") != -1){
                    // 詳細檢查單字裡的所有to
                    for (int i = 0; i < word.length(); i++) {
                        char c = word.charAt(i);
                        if (c == 't' && i != word.length() - 1) {
                            char c_2 = word.charAt(i+1);
                            if (c_2 == 'o') {
                                count_to++;
                            }
                        }
                    }
                }
            }
            System.out.println("統計結果");
            System.out.println("e 出現的次數 :" + count_e);
            System.out.println("to 出現的次數 :" + count_to);
        } catch (IOException | NoSuchElementException | IllegalStateException e) {
            e.printStackTrace();
        }
    }
}
