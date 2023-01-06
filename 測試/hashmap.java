package 測試;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap <Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "var1");
        map.put(2, "var2");
        map.put(3, "var3");
        System.out.println(map);
        for (String string : map.values()) {
            System.out.println(string);
        }
    }
}
