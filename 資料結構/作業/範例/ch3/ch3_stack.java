package 資料結構.作業.範例.ch3;

import java.io.*;

public class ch3_stack {
    public static int MaxNum = 10; // 定義堆疊大小
    public static char Stack[] = new char[MaxNum]; // 以陣列Stack當作堆疊
    public static int Top = -1; // Top紀錄目前堆疊頂端的索引值，初始值設為-1表示堆疊為空

    public static void main(String[] args) throws IOException {
        // 輸入
        int op = 0;
        while (op != -1) {
            BufferedReader indata;
            indata = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("1.Push(堆)");
            System.out.println("2.Pop(彈)");
            System.out.println("3.TopItem");
            System.out.println("4.IsEmpty");
            System.out.println("5.IsFull");
            System.out.println("6.顯示目前Stack的內容(從Top to bottom)");

            System.out.print("請輸入你的操作：");

            String str = indata.readLine();
            op = Integer.parseInt(str);

            switch (op) {
                case 1:
                    System.out.print("請輸入你要push的資料：");
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    String str1 = br.readLine();
                    char item = str1.charAt(0);
                    Push(item); // 呼叫Push副程式
                    break;
                case 2:
                    System.out.println(Pop() + "是從堆疊彈出的資料"); // 呼叫Pop副程式
                    break;
                case 3:
                    PrintStack(); // 顯示目前Stack的內容
                    break;
                case 4:
                    PrintStack(); // 顯示目前Stack的內容
                    break;
                case 5:
                    PrintStack(); // 顯示目前Stack的內容
                    break;
                case 6:
                    PrintStack(); // 顯示目前Stack的內容
                    break;
            }
        }
    }

    public static void Push(char item) // Push副程式
    {
        if (Top == MaxNum - 1)
            System.out.println("堆疊是滿的!");
        else
            Stack[++Top] = item;
    }

    public static char Pop() // Pop副程式
    {
        if (Top == -1) {
            System.out.println("堆疊是空的!");
            return ('X');
        } else
            return Stack[Top--];
    }

    public static void PrintStack() // 列印目前堆疊的內容
    {
        int i;
        if (Top == -1) {
            System.out.println("堆疊是空的!\n");
        } else {
            System.out.print("目前堆疊的內容為: ");
            for (i = Top; i >= 0; i--)
                System.out.print(Stack[i] + " \t");
            System.out.println();
        }
    }
}