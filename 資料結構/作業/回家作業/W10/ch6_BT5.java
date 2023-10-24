package 資料結構.作業.回家作業.W10;

/**
 * 題目:ch. 6 二元樹的陣列表示法 (week 16)
 * 
 * 
 * 日期:2022.06.14
 */

import java.io.*;
import java.util.*;

public class ch6_BT5 {

    public static void main(String[] args) throws IOException {
        System.out.println("二元樹的陣列表示法 ");
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入二元樹高度h(h至少為1) :");
        int h = sc.nextInt();
        System.out.print("輸入資料筆數n(h<=n<=2^h) :");
        int n = sc.nextInt();
        int binaryTree[] = new int[n];
        binaryTree = data(binaryTree);
        while (true) {
            System.out.println("輸入一整數選擇下列選項 :");
            System.out.println("(1) 二元樹陣列表示法驗證正確性");
            System.out.println("(2) 二元樹節點分析");
            System.out.println("(3) 二元樹拜訪(前序式)");
            System.out.println("(4) 二元樹拜訪(中序式)");
            System.out.println("(5) 二元樹拜訪(後序式)");
            System.out.println("(6) 重新產生二元樹");
            System.out.println("(7) 產生新的二元樹");
            System.out.println("(-1)結束程式");
            int choose = sc.nextInt();

            if (choose == -1) {
                System.out.println("程式已終止 !");
                break;
            }

            switch (choose) {
                case 1:
                    System.out.println("(1)二元樹陣列表示法驗證正確性");
                    System.out.printf("\n判斷以陣列表示法儲存高度為 %d 的二元樹是不是正確的二元樹", h);
                    System.out.printf("\n假設節點的數值為正整數，空的節點的數值為0");
                    System.out.printf("\n高度是 %d 的二元樹，若為full binary tree會有 %3d 節點,再加上陣列保留編號0的位置，共計 %3d 筆資料", h, n - 1,
                            n);
                    System.out.printf("\n\n這棵二元樹的陣列表示法（不包含索引值為0）：");
                    for (int i = 1; i < n; i++) {
                        System.out.printf(" %3d", binaryTree[i]);
                    }

                    int ErrorNo_1 = 0; // 儲存出錯的節點個數

                    // 檢查所有可能的內部的節點，編號為1,2,..., (n-1)/2
                    // 三層的樹最多 7 (2^3-1)的節點，只需檢查前兩層 1,2,3
                    // 四層的樹最多15 (2^4-1)的節點，只需檢查前三層 1,2,3, ...,7
                    for (int i = 1; i <= (n - 1) / 2; i++) {
                        int LeftChild = 2 * i;
                        int RightChild = 2 * i + 1;
                        // 判斷條件：如果該節點的數值為0, 則兩個子節點的值應該也要是0
                        int no = 0;
                        if (binaryTree[i] == 0) {
                            if (binaryTree[LeftChild] != 0) {
                                System.out.printf("\n樹葉節點 %d 發生錯誤:有左子節點，數值為 %d ", i, binaryTree[LeftChild]);
                                no++;
                            }

                            if (binaryTree[RightChild] != 0) {
                                System.out.printf("\n樹葉節點 %d 發生錯誤:有右子節點，數值為 %d ", i, binaryTree[RightChild]);
                                no++;
                            }

                            if (no != 0) {
                                ErrorNo_1++; // 錯誤的節點個數加一
                            }
                        }
                    }

                    if (ErrorNo_1 != 0) {
                        System.out.printf("\n\n以陣列表示法輸入的二元樹有 %3d 個節點有錯\n", ErrorNo_1);
                    } else {
                        System.out.printf("\n\n以陣列表示法輸入的二元樹是正確的\n\n");
                    }
                    break;
                case 2:
                    System.out.println("(2)二元樹節點分析");
                    System.out.printf("\n判斷以陣列表示法儲存高度為 %d 的二元樹是不是正確的二元樹", h);
                    System.out.printf("\n假設節點的數值為正整數，空的節點的數值為0");
                    System.out.printf("\n高度是 %d 的二元樹，若為full binary tree會有 %3d 節點,再加上陣列保留編號0的位置，共計 %3d 筆資料", h, n - 1,
                            n);
                    System.out.printf("\n\n這棵二元樹的陣列表示法：");
                    for (int i = 1; i < n; i++) {
                        System.out.printf(" %3d", binaryTree[i]);
                    }

                    int TotalNo = 0; // 記錄二元樹的節點總個數
                    for (int i = 1; i < n; i++) {
                        if (binaryTree[i] != 0) // 遇到不為零的節點，數目加一
                        {
                            TotalNo++;
                        }
                    }
                    System.out.printf("\n節點的總數為 %3d\n", TotalNo);

                    int NoLeafNode = 0;
                    int NoInternalNode = 0;
                    System.out.printf("\n判斷個別節點是內部節點 or 樹葉節點");
                    for (int i = 1; i < n; i++) {
                        if (binaryTree[i] != 0) {
                            int value = IsLeaf(i, n + 1, binaryTree);
                            if (value == 1) {
                                NoLeafNode++;
                                System.out.printf("\n 節點編號 %3d | 數值為 %3d, 它是樹葉節點 (leaf node)", i, binaryTree[i]);
                            } else {
                                NoInternalNode++;
                                System.out.printf("\n 節點編號 %3d | 數值為 %3d, 它是內部節點 (internal node)", i, binaryTree[i]);
                            }
                        }
                    }
                    System.out.printf("\n\t內部節點的個數為 %3d", NoInternalNode);
                    System.out.printf("\n\t樹葉節點的個數為 %3d", NoLeafNode);
                    System.out.println();
                    break;
                case 3:
                    System.out.printf("\n利用 Preoder 來拜訪一棵高度為 %d 的二元樹", h);

                    System.out.printf("\n這棵二元樹的陣列表示法：\n");
                    for (int i = 1; i < n; i++) {
                        System.out.printf(" %3d", binaryTree[i]);
                    }

                    System.out.printf("\n\n進行 Preorder Tree Traversal 的處理\n", h);
                    // 進行 Preorder Tree Traversal 的處理

                    PreorderTraversal(1, n, binaryTree);
                    System.out.println();
                    break;
                case 4:
                    System.out.printf("\n利用 Inoder 來拜訪一棵高度為 %d 的二元樹", h);

                    System.out.printf("\n這棵二元樹的陣列表示法：\n");
                    for (int i = 1; i < n; i++) {
                        System.out.printf(" %3d", binaryTree[i]);
                    }

                    System.out.printf("\n\n進行 Inorder Tree Traversal 的處理\n", h);
                    // 進行 Inorder Tree Traversal 的處理

                    InorderTraversal(1, n, binaryTree);
                    System.out.println();
                    break;
                case 5:
                    System.out.printf("\n利用 Postorder 來拜訪一棵高度為 %d 的二元樹", h);

                    System.out.printf("\n這棵二元樹的陣列表示法：");
                    for (int i = 1; i < n; i++) {
                        System.out.printf(" %3d", binaryTree[i]);
                    }

                    System.out.printf("\n\n進行 Postorder Tree Traversal 的處理\n", h);
                    // 進行 Postorder Tree Traversal 的處理

                    PostorderTraversal(1, n, binaryTree);
                    System.out.println();
                    break;
                case 6:
                    binaryTree = data(binaryTree);
                    System.out.println("已重新生成二元樹\n");
                    break;
                case 7:
                    System.out.print("輸入二元樹高度h(h至少為1) :");
                    h = sc.nextInt();
                    System.out.print("輸入資料筆數n(h<=n<=2^h) :");
                    n = sc.nextInt();
                    binaryTree = new int[n];
                    binaryTree = data(binaryTree);
                    System.out.println("已產生新的二元樹\n");
                    break;
                default:
                    System.out.println("無此選項，請重新輸入\n");
                    break;
            }
        }
        sc.close();
    }

    public static int[] data(int n[]) {
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (Math.random() * n.length);
        }
        return n;
    }

    // 判斷編號為 no 的節點是不是樹葉節點
    // 如果是，傳回 1
    // 如果不是，傳回 0
    public static int IsLeaf(int no, int n, int binaryTree[]) {
        // 三層的二元樹，只有編號 1, 2, 3 的才有可能是內部節點
        // 編號 1, 2, 3 的節點還要再檢查是否有左邊的孩子或是右邊的孩子
        // ==> ( BinTree[2*i]!=0 || BinTree[2*i+1]!=0 ) 1 <= i <=3
        // 編號 4, 5, 6, 7 的一定是樹葉節點

        if (no < n / 2) {
            if ((binaryTree[2 * no] != 0) || (binaryTree[2 * no + 1] != 0)) {
                return (0);
            } else {
                return (1);
            }
        } else {
            return (1);
        }
    }

    // 進行 Preorder Tree Traversal 的處理
    public static void PreorderTraversal(int no, int n, int binaryTree[]) {
        if (binaryTree[no] != 0) {
            // 處理目前的樹根節點, 直接輸出
            System.out.printf("%3d ", binaryTree[no]);

            if (no < n / 2) {
                if (binaryTree[2 * no] != 0) {
                    PreorderTraversal(2 * no, n, binaryTree);
                }

                if (binaryTree[2 * no + 1] != 0) {
                    PreorderTraversal(2 * no + 1, n, binaryTree);
                }
            }
        }
    }

    // 進行 Inorder Tree Traversal 的處理
    public static void InorderTraversal(int no, int n, int binaryTree[]) {
        if (binaryTree[no] != 0) {
            if (2 * no < n / 2) {
                InorderTraversal(2 * no, n, binaryTree);
            } else {
                if (binaryTree[2 * no] != 0) {
                    System.out.printf("%3d ", binaryTree[2 * no]);
                }
            }

            // 處理目前的樹根節點, 直接輸出
            System.out.printf("%3d ", binaryTree[no]);

            if ((2 * no + 1) < n / 2) {
                InorderTraversal(2 * no + 1, n, binaryTree);
            } else {
                if (binaryTree[2 * no + 1] != 0) {
                    System.out.printf("%3d ", binaryTree[2 * no + 1]);
                }
            }
        }
    }

    // 進行 Postorder Tree Traversal 的處理
    public static void PostorderTraversal(int no, int n, int[] binaryTree) {
        if (binaryTree[no] != 0) {

            if (no < n / 2) {
                if (binaryTree[2 * no] != 0) {
                    PostorderTraversal(2 * no, n, binaryTree);
                }

                if (binaryTree[2 * no + 1] != 0) {
                    PostorderTraversal(2 * no + 1, n, binaryTree);
                }
            }

            // 處理目前的樹根節點, 直接輸出
            System.out.printf("%3d ", binaryTree[no]);

        }
    }
}
