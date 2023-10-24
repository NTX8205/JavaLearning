package 資料結構.作業.範例.ch3;
public class ch3_5_1
{
  static int count = 0;
  public static void main(String[] args) 
  { //宣告及設定初值
      int Result, Max = 10;
    //處理
      Result = fact(Max);   //呼叫自定函數
    //輸出
      System.out.println("fact函式被呼叫了" + count + "次");
      System.out.println("1*2*...*10=" + Result);  
   }

  static int fact(int n)  //遞迴函數名稱
  {
    count++;
    if (n <=1)            //遞迴函數的終值
      return 1;
    else{
      System.out.println("fact(" + n + ")呼叫fact(" + (n-1) + ")");
      return n * fact(n - 1); //函數自己又可以呼叫自己
    }
  }
}
