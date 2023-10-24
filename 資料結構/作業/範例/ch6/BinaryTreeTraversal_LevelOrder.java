package 資料結構.作業.範例.ch6;

//
// 利用 Level Order (層次順序) 來拜訪一棵給定的二元樹, 利用陣列表示法來儲存這個樹
//
// 假設這顆樹儲存的元素值為 正整數, 節點的值為 0 代表的是 null
//
// 利用循環佇列 circular queue 來記錄需要一層一層尚未拜訪節點編號
//     一開始將二元樹的樹根（編號1）放到循環佇列中
//     循序地從佇列中取出一筆資料
//           (1) 輸出該編號節點的資料值
//           (2) 將取出前的循環佇列內容印出 （包含目前節點編號）
//           (3) 將目前處理的節點之孩子的節點編號放到循環佇列中
//
// 日期：2014/12/29
// Author: Yu-Chen Hu

import java.io.*;
public class BinaryTreeTraversal_LevelOrder {

   // h: 樹的高度
   // 三層的樹 n= 8, 四層的樹 n = 16
   // tree[0] = 0 保留
   //
   // 5 tree[1] = 5 樹根
   // 4 2 tree[2] = 4 and tree[3] = 2
   // x 6 1 x tree[4] = 0 在這裡 0 代表 null
   // tree[5] = 6 and tree[6] = 1
   // tree[7] = 0 在這裡 0 代表 null
   // 第一組測試資料

   // static int h = 3;
   // static int n = 8;
   // static int BinTree[] = {0,5,4,2,0,6,1,0};

   // 第二組測試的資料
   static int h = 4;
   static int n = 16;
   //
   // 5
   // 4 2
   // 3 x 8 9
   // 6 7 x x 1 x 10 11
   //
   static int BinTree[] = { 0, 5, 4, 2, 3, 0, 8, 9, 6, 7, 0, 0, 1, 0, 10, 11 };

   public static void main(String[] args) throws IOException {

      System.out.printf("\n利用 Level Order 來拜訪一棵高度為 %d 的二元樹", h);

      System.out.printf("\n這棵二元樹的陣列表示法：");
      for (int i = 1; i < n; i++) {
         System.out.printf(" %3d", BinTree[i]);
      }

      System.out.printf("\n\n進行 Level Order Tree Traversal 的處理\n", h);
      // 進行 Level Order Tree Traversal 的處理

      LevelOrderTraversal();

   }

   // 進行 Level Order Tree Traversal 的處理
   // 使用 circular queue 循環佇列，大小為 n
   public static void LevelOrderTraversal() {
      int CQueue[] = new int[n];
      int front = 0;
      int rear = 0;
      int size = 0;

      for (int i = 0; i < n; i++) {
         CQueue[i] = 0;
      }

      if (BinTree[1] != 0) // 如果樹根是不是空的，將樹根的編號放到 CQueue 中
      {
         rear = (rear + 1) % n;
         CQueue[rear] = 1;
         size++;
      }

      while (size > 0) {
         // 從 CQueue 取出一筆資料
         front = (front + 1) % n;
         int index = CQueue[front];
         size--;

         System.out.printf("\n處理編號%3d的節點，數值為 %3d │ CQueue內容： ", index, BinTree[index]);
         for (int i = 0; i < n; i++) {
            System.out.printf("%2d ", CQueue[i]);
         }

         // 將取出資料的節點歸零
         CQueue[front] = 0;

         // System.out.printf("%3d ",BinTree[index]);

         if (index < n / 2) // 位於 h-1 層
         {
            int LeftChild = 2 * index;
            int RightChild = 2 * index + 1;
            // 若左邊孩子節點不是空的，將其編號加入 Cqueue 中
            if (BinTree[LeftChild] != 0) {
               rear = (rear + 1) % n;
               CQueue[rear] = LeftChild;
               size++;
            }

            // 若右邊孩子節點不是空的，將其編號加入 Cqueue 中
            if (BinTree[RightChild] != 0) {
               rear = (rear + 1) % n;
               CQueue[rear] = RightChild;
               size++;
            }
         }
      }
   }
}