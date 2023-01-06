package 資料結構.作業.範例.ch3;
public class ch3_5_3
{

  static int count = 0;
  public static void main(String[] args) 
  { //宣告及設定初值
      int a=18,b=15;
    //處理及輸出
      
      System.out.println("最大公因數為=" + GCD(a, b)); 
      System.out.println("GCD函式被呼叫了" + count + "次"); 
   }

  static int GCD(int a,int b)  //函數名稱
  {
    count++;
    int c;
    c = a % b;    //取餘數
    if (c == 0)
        return b;
    else
        System.out.println("GCD(" + a +","+b+ ")呼叫GCD(" +b+","+c+ ")");
        return GCD(b, c);  //函數自己又可以呼叫自己
  }
}
