package 資料結構.作業.回家作業.W5;

/**
 * 題目:排序演算法實作
 * 
 * 
 * 
 * 日期:2022.04.12
 */

import java.util.*;

public class ch8_N {
  static int process = 0;

  public static void main(String[] args) {

    int choice;
    Scanner sc = new Scanner(System.in);

    System.out.printf("排序方法實做，輸入數字決定排序方法\n");
    System.out.printf("(1)使用氣泡排序\n"); // 算出資料交換的次數 (加分)
    System.out.printf("(2)使用選擇排序\n");
    System.out.printf("(3)使用插入排序\n"); // 算出資料交換的次數 (加分)
    System.out.printf("(4)使用快速排序\n");
    System.out.printf("(5)使用上述四種排序方法\n");
    System.out.printf("請輸入你的選項: ");

    // 改成使用者輸入
    choice = sc.nextInt();
    System.out.println();

    if (choice >= 1 && choice <= 5) {

      // 隨機產生 num 個正整數
      System.out.println("選擇測試筆數");
      System.out.println("(1)10");
      System.out.println("(2)100");
      System.out.println("(3)1000");
      System.out.println("(4)10000");
      System.out.println("(5)100000");
      System.out.print("請輸入選項:");
      int choice2 = sc.nextInt();

      sc.close();
      System.out.println();
      if (choice2 >= 1 && choice2 <= 5) {

        int num = 0;

        if (choice2 == 1) {
          num = 11;
        } else if (choice2 == 2) {
          num = 101;
        } else if (choice2 == 3) {
          num = 1001;
        } else if (choice2 == 4) {
          num = 10001;
        } else if (choice2 == 5) {
          num = 100001;
        }

        int data[] = new int[num];
        data = randomnum(data);

        // 根據使用者輸入選項進行排序處理
        if (choice == 1) {
          System.out.println("使用氣泡排序");
          System.out.println("測試筆數:" + (num - 1) + "\n");
          bubble_sort(data);
        } else if (choice == 2) {
          System.out.println("使用選擇排序");
          System.out.println("測試筆數:" + (num - 1) + "\n");
          selection_sort(data);
        } else if (choice == 3) {
          System.out.println("使用插入排序");
          System.out.println("測試筆數:" + (num - 1) + "\n");
          insertion_sort(data);
        } else if (choice == 4) {
          System.out.println("使用快速排序");
          System.out.println("測試筆數:" + (num - 1) + "\n");
          quick_sort(data, 0, num - 2, num - 1);
        } else if (choice == 5) {

          System.out.println("使用氣泡、選擇、插入、快速排序");
          System.out.println("測試筆數:" + (num - 1) + "\n");
          bubble_sort(data);
          selection_sort(data);
          insertion_sort(data);
          quick_sort(data, 0, num - 2, num - 1);
        }
      } else {
        System.out.println("輸入選項 " + choice2 + " 錯誤");
      }

    } else {
      System.out.printf("\n輸入的選項 %d 錯誤!\n", choice);
    }

    sc.close();

  }

  public static int[] randomnum(int n[]) // 產生n個1~100000的亂數值的副程式
  {
    for (int i = 0; i < n.length - 1; i++) {
      n[i] = (int) (Math.random() * 100000) + 1;
    }
    return n;
  }

  public static void showdata(int[] d) {
    for (int i = 0; i < d.length - 1; i++) {
      System.out.print(d[i] + " ");
    }
    System.out.println();
  }

  public static void showunsort(int[] d) {
    System.out.print("unsort :");
    for (int i = 0; i < d.length - 1; i++) {
      System.out.print(d[i] + " ");
    }
    System.out.println();
  }

  public static void showsort(int[] d) {
    System.out.print("sort :");
    for (int i = 0; i < d.length - 1; i++) {
      System.out.print(d[i] + " ");
    }
    System.out.println();
  }

  public static void bubble_sort(int data[]) // 氣泡排序法進行由小到大排序
  {
    long startTime = System.currentTimeMillis(); // 獲取開始時間
    long countBubbleSort = 0;
    int temp = 0;
    int sdata[] = data.clone();

    // showunsort(sdata);

    for (int i = 0; i < sdata.length - 2; i++) {
      for (int j = 0; j < sdata.length - i - 2; j++) {
        if (sdata[j] > sdata[j + 1]) // 兩數交換
        {
          temp = sdata[j];
          sdata[j] = sdata[j + 1];
          sdata[j + 1] = temp;
          countBubbleSort++;
        }
      }

      // System.out.println("資料交換次數:" + countBubbleSort);
      // System.out.print("第"+(i+1)+"次");
      // showdata(sdata);

    }
    long endTime = System.currentTimeMillis(); // 獲取結束時間

    System.out.printf("氣泡排序 程式執行時間=%.3fs\n", (double) (endTime - startTime) / 1000);
    System.out.println("資料交換次數:" + countBubbleSort);
    // showsort(sdata);
    System.out.println();
  }

  public static void selection_sort(int data[]) {
    // System.out.printf("\nselection_sort() 施工中\n");

    int[] d = data.clone();

    // showunsort(d);

    long startTime = System.currentTimeMillis();// 獲取開始時間
    for (int i = 0; i < d.length - 2; i++) {
      for (int j = i + 1; j < d.length - 1; j++) {
        if (d[i] > d[j]) {
          int temp = d[i];
          d[i] = d[j];
          d[j] = temp;
        }
      }
    }
    long endTime = System.currentTimeMillis(); // 獲取結束時間
    System.out.printf("選擇排序 程式執行時間=%.3fs\n", (double) (endTime - startTime) / 1000);
    System.out.println();
    // showsort(d);
  }

  public static void insertion_sort(int data[]) {

    int[] d = data.clone();
    // showunsort(d);

    long startTime = System.currentTimeMillis();// 獲取開始時間

    long countInsertSort = 0;
    int i;
    int j;
    int temp;

    for (i = 1; i < d.length - 1; i++) {

      temp = d[i];
      j = i - 1;
      while (j >= 0 && temp < d[j]) {
        d[j + 1] = d[j];
        countInsertSort++;
        j--;

      }
      d[j + 1] = temp;

      // System.out.println("資料交換次數:" + countInsertSort);
      // System.out.print("第" + (i) + "次");
      // showdata(d);

    }

    long endTime = System.currentTimeMillis(); // 獲取結束時間

    System.out.printf("插入排序 程式執行時間=%.3fs\n", (double) (endTime - startTime) / 1000);
    System.out.println("資料交換次數:" + countInsertSort);
    // showsort(d);
    System.out.println();
  }

  public static void quick_sort(int A[], int left, int right, int index) {
    int[] d = A.clone();

    // showunsort(d);

    long startTime = System.currentTimeMillis();// 獲取開始時間
    quick_sort_process(d, left, right, index);
    long endTime = System.currentTimeMillis(); // 獲取結束時間
    System.out.printf("快速排序 程式執行時間=%.3fs\n", (double) (endTime - startTime) / 1000);
    System.out.println();
    // showsort(d);
  }

  public static void quick_sort_process(int A[], int left, int right, int index) {
    int lower, upper, key, temp;
    lower = left;
    upper = right + 1;
    key = A[left];
    if (lower < upper) {
      do {
        do {
          lower++;
        } while (A[lower] <= key && lower <= right);
        do {
          upper--;
        } while (A[upper] >= key && upper > left);

        if (lower < upper) {
          temp = A[lower];
          A[lower] = A[upper];
          A[upper] = temp;
        }
      } while (lower < upper);
      if (lower > upper) {
        temp = A[left];
        A[left] = A[upper];
        A[upper] = temp;
      }
      quick_sort_process(A, left, upper - 1, index);
      quick_sort_process(A, upper + 1, right, index);
    }
  }
}
