package 資料結構.作業.範例.ch4;

import java.io.*;

public class ch4_3_2 {
    public static int NUM = 10;
    public static int CQueue[] = new int[NUM];; // 宣告queue
    public static int Rear; // 宣告佇列的尾端
    public static int Front; // 宣告佇列的前端

    public static void main(String[] args) throws IOException {
        // 輸入
        int op = 0;
        Rear = 0;
        Front = 0;
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
                    Enqueue(item); // 呼叫Enqueue副程式
                    break;
                case 2:
                    item = Dequeue(); // 呼叫Dequeue副程式
                    if (item != -1)
                        System.out.println(item + "是從佇列刪除的資料");
                    break;
                case 3:
                    PrintQueue(); // 呼叫PrintQueue副程式
                    break;
            }
        }
    }

    public static void Enqueue(char item) // Enqueue副程式
    {
        Rear = (Rear + 1) % NUM;
        if ((Rear + 1) % NUM == Front) {
            System.out.println("佇列是滿的!\n");
            return;
        } else
            CQueue[++Rear] = item;

    }

    public static char Dequeue() // Dequeue副程式
    {
        if (Front == Rear) {
            System.out.println("佇列是空的!\n");
            return 'x';
        } else
            Front = (Front + 1) % NUM;
        return (char) CQueue[++Front];
    }

    public static void PrintQueue() // 列印目前佇列的內容之副程式
    {
        int i;
        for (i = Rear; i != Front; i = (i + NUM - 1) % NUM)
            System.out.println((char) CQueue[i]);
    }
}