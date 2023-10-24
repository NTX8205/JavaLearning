package 測試;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashset {
    public static void main(String[] args) {
        Set<String> str = new HashSet<>();
        str.add("hello");
        str.add("world");
        str.add("alphabet");
        str.add("nurse");
        System.out.println(str);
        for (String string : str) {
            System.out.println(string);
        }

        System.out.println("iterator :");
        Iterator<String> it = str.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
