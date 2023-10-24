package 資料結構.作業.範例.ch5;


import java.util.LinkedList;

public class ch5_4_ex3 {
	public static void main(String args[]) {
		int start_node = 1, end_node = 6;

		String Sum_Node[] = { "head", "10", "20", "30", "40", "50", "null" };

		LinkedList<String> LL = new LinkedList<String>(); // 建立一個空的鏈結串列
		System.out.println("建立一個鏈結串列：");

		while (start_node <= end_node) {
			LL.addLast(Sum_Node[start_node]);
			start_node++;
		}

		while (LL.getFirst() != "null") {
			System.out.print(LL.getFirst() + "->");
			LL.removeFirst();
		}
		System.out.print("null");
	}
}