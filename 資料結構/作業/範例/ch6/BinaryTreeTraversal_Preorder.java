package 資料結構.作業.範例.ch6;

//
// 利用 Preorder (前序式) 來拜訪一棵給定的二元樹, 利用陣列表示法來儲存這個樹
//
// 假設這顆樹儲存的元素值為 正整數, 節點的值為 0 代表的是 null
//
// 日期：2014/12/17
// Author: Yu-Chen Hu

import java.io.*;

public class BinaryTreeTraversal_Preorder {

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

   static int h = 3;
   static int n = 8;
   static int BinTree[] = { 0, 5, 4, 2, 0, 6, 1, 0 };

   // 第二組測試的資料
   // static int h = 4;
   // static int n = 16;
   //
   // 5
   // 4 2
   // 3 x 8 9
   // 6 7 x x 1 x 10 11
   //
   // static int BinTree[] = {0,5,4,2,3,0,8,9,6,7,0,0,1,0,10,11};

   public static void main(String[] args) throws IOException {

      System.out.printf("\n利用 Preoder 來拜訪一棵高度為 %d 的二元樹", h);

      System.out.printf("\n這棵二元樹的陣列表示法：");
      for (int i = 1; i < n; i++) {
         System.out.printf(" %3d", BinTree[i]);
      }

      System.out.printf("\n\n進行 Preorder Tree Traversal 的處理\n", h);
      // 進行 Preorder Tree Traversal 的處理

      PreorderTraversal(1);

   }

   // 進行 Preorder Tree Traversal 的處理
   public static void PreorderTraversal(int no) {
      if (BinTree[no] != 0) {
         // 處理目前的樹根節點, 直接輸出
         System.out.printf("%3d ", BinTree[no]);

         if (no < n / 2) {
            if (BinTree[2 * no] != 0) {
               PreorderTraversal(2 * no);
            }

            if (BinTree[2 * no + 1] != 0) {
               PreorderTraversal(2 * no + 1);
            }
         }
      }
   }

}