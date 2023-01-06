package 資料結構.作業.範例.ch3;
public class ch3_5_2
{
  static int count=0;
  public static void main(String[] args) 
  { //宣告及設定初值
      int n = 6,Sum;
    //處理
      Sum = Fib(n);      //呼叫自定函數
    //輸出
      System.out.println("Fib函式被呼叫了" + count + "次");
      System.out.println("Sum=" + Sum);  
   }

  static int Fib(int n)  //函數名稱
   {
    count++;
    if (n <= 2)            //遞迴函數的終值
      return 1;
    else{
      System.out.println("Fib(" + n + ")呼叫Fib(" + (n - 1) + ")呼叫Fib(" + (n - 2) + ")");
      return Fib(n-1) + Fib(n - 2); //函數自己又可以呼叫自己

    }
     
   }
}
