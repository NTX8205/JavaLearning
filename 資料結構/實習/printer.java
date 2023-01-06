package 資料結構.實習;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class printer {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int WorksPeriod = sc.nextInt();
        for (int i = 0; i < WorksPeriod; i++) {
            PrinterQueue printerQueue = new PrinterQueue();
            int WorksAmount = sc.nextInt();
            int MyJobLocation = sc.nextInt();
            printerQueue.inputWorks(WorksAmount, MyJobLocation);
            printerQueue.printWorkingTime();
        }
        sc.close();
    }
    
}

class PrinterQueue {
    Queue<Integer> printerQueue;
    int MyJobLocation;
    int Time= 0;
    public PrinterQueue() {
        printerQueue = new LinkedList<Integer>();
        Time =1;
    }

    public void inputWorks(int WorksAmount, int MyJobLocation) {
        Scanner sc = new Scanner(System.in);
        this.MyJobLocation = MyJobLocation;
        for (int i = 0; i < WorksAmount; i++) {
            printerQueue.add(sc.nextInt());
        }
        sc.close();
    }

    public void printWorkingTime() {
        CalculateWorkingTime();
        System.out.println(Time);
    }

    public void CalculateWorkingTime() {
        while(printerQueue.size() > 0) {
            if (isHighestPriorityWork()) {
                System.out.println("Work Number is polled out; " + printerQueue.peek() );
                printerQueue.poll();
                Time++;
                if (isMyJob()) {
                    return;
                }
                MyJobLocation--;
            }
            else {
                moveWorkToBack();
                if (isMyJob()) {
                    MyJobLocation += printerQueue.size()-1;
                }
                else {
                    MyJobLocation--;
                }
            }
        }
    }

    public boolean isMyJob() {
        return MyJobLocation == 0;
    }

    public boolean isHighestPriorityWork() {
        if (isLastWork()) {
            return true;
        }
        int HighestPriority = Collections.max(printerQueue);
        if (printerQueue.peek() == HighestPriority) {
            return true;
        }
        return false;
    }

    public boolean isLastWork() {
        return printerQueue.size() == 1;
    }

    public void moveWorkToBack() {
        printerQueue.add(printerQueue.poll());
    }
}
