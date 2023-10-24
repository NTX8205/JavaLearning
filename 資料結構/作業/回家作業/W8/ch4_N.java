package 資料結構.作業.回家作業.W8;

import java.io.*;

public class ch4_N {

    public static int NUM = 10; // 定義堆疊大小
    public static char Queue[] = new char[NUM]; // 宣告及建立佇列
    public static int Rear; // 宣告佇列的尾端
    public static int Front; // 宣告佇列的前端

    public static void main(String[] args) throws IOException {
        // 輸入
        int op = 0;
        Rear = -1;
        Front = -1;
        while (op != -1) {
            BufferedReader indata;
            indata = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("1.enqueue(加入) 2.dequeue(刪除) 3.顯示目前佇列的內容");
            System.out.print("請輸入你的操作：");
            String str = indata.readLine();
            op = Integer.parseInt(str);
            switch (op) {
                case 1:
                    System.out.print("請輸入你要加入的資料：");
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    String str1 = br.readLine();
                    char item = str1.charAt(0);
                    // System.out.println(item);
                    Enqueue(item); // 呼叫Enqueue副程式
                    break;
                case 2:
                    item = Dequeue(); // 呼叫Dequeue副程式
                    if (item != -1)
                        System.out.println(item + "是從佇列刪除的資料");
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    PrintQueue(); // 呼叫PrintQueue副程式
                    break;
            }
        }
    }

    public static void Enqueue(char item) // Enqueue副程式
    {

        if (Rear == NUM - 1) {
            System.out.println("佇列是滿的!\n");
            return;
        } else
            Queue[++Rear] = item;

    }

    public static char Dequeue() // Dequeue副程式
    {
        if (Front == Rear) {
            System.out.println("佇列是空的!\n");
            return 'x';
        } else
            return (char) Queue[++Front];
    }

    public static void PrintQueue() // 列印目前佇列的內容之副程式
    {
        int i;
        for (i = Rear; i >= Front + 1; i--)
            System.out.println((char) Queue[i]);
    }
}
