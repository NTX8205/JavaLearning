package 練習.移除重複數字;

import java.util.*;
public class removeNum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arry = new ArrayList<Integer>();
        while (sc.hasNext()) {
            arry.add(sc.nextInt());
        }
        TreeSet<Integer> ints = new TreeSet<Integer>();

        for (int n : arry)
            ints.add(n);

        for (int n : ints)
            System.out.print(n + " ");

        System.out.println();
        sc.close();
    }
}
