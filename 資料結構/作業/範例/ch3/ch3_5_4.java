package 資料結構.作業.範例.ch3;

import java.io.*;
public class ch3_5_4
{
  public static void main(String[] args) throws IOException
  {   //輸入
        BufferedReader indata;
        indata=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("請輸入盤子個數n：");
        String str=indata.readLine();
        int n=Integer.parseInt(str);
        Towers (n,'A','B','C');
   }

  public static void Towers(int n, char from, char through, char to)
  {
    if (n > 0)
     {
       Towers (n - 1, from, to, through);
       System.out.println("將盤子 " +n+ "從柱子 " +from+ "移到柱子 " +to);
       Towers (n - 1, through, from, to);
     }
  }
}
