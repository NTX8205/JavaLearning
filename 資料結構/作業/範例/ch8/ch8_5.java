package 資料結構.作業.範例.ch8;



public class ch8_5 {
  public static int MAX = 100001;
  public static int A[] = new int[MAX];

  public static void main(String[] args) {
    System.out.println("===============程式描述================");
    System.out.println("= 程式名稱：ch8_5.java                =");
    System.out.println("= 程式目的：追蹤「快速排序法」的過程  =");
    System.out.println("=======================================");
    System.out.println("=================輸入==================");
    RandomNum(); // 呼叫產生10個亂數值的副程式
    System.out.println("=================輸出==================");
    QuickSort(A, 0, MAX - 2, MAX-1); // 呼叫快速排序法的副程式
    showdata();
    System.out.println("end");
  }

  // 產生10個亂數值之副程式
  public static void RandomNum() {
    int i;
    System.out.println("產生10個亂數值：");
    for (i = 0; i < MAX; i++) {
      A[i] = (int) (Math.random() * 100000) + 1; // 產生10~100的整數亂數值
      System.out.print(A[i] + "  ");
    }
    System.out.println();
  }

  // 快速排序法之副程式
  public static void QuickSort(int A[], int left, int right, int index) {
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
      if (lower > upper)
        // System.out.println();
      {
        temp = A[left];
        A[left] = A[upper];
        A[upper] = temp;
        // for (k = 0; k < index; k++)
        //   System.out.print(A[k] + " ");
      }
      QuickSort(A, left, upper - 1, index); // 對左邊進行遞迴
      QuickSort(A, upper + 1, right, index); // 對右邊進行遞迴
    }
  }

  static void showdata() {

    for (int i = 0; i < MAX-1; i++) {
      System.out.print(A[i] + " ");
    }
    System.out.println();
  }

}