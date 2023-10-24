package 資料結構.考試.補考;

import java.util.Scanner;

/**
 * 題目:三號出局
 * 
 * 
 * 
 * 日期:2022.04.15
 */

public class Q4 {

    public static void main(String[] args) {

        System.out.println("三號出局");

        Scanner sc = new Scanner(System.in);

        System.out.print("輸入人數: ");
        int num = sc.nextInt();
        sc.close();

        if (num <= 20 && num >= 5) {
            int[] people = new int[num];

            for (int i = 0; i < num; i++) {
                people[i] = i + 1;
            }
            int count = 1;
            System.out.print("出局人編號: ");
            while (num > 1) {

                for (int i = 0; i < people.length; i++) {
                    if (people[i] != 0) {
                        if (count == 3) {
                            System.out.print(people[i] + " ");
                            people[i] = 0;
                            count = 1;
                            num--;
                        } else {
                            count++;
                        }
                    } else {
                        continue;
                    }

                }
            }
            for (int i = 0; i < people.length; i++) {
                if (people[i] != 0) {
                    System.out.print("\n最後一位編號: " + people[i]);
                }
            }
        } else {
            System.out.println("人數只能介於5~20人之間");
        }

    }
}
