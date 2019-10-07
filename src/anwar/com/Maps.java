package anwar.com;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        HashMap<Integer, String> hMap = new HashMap<Integer, String>();
        mapUtil(hMap);
    }

    private static void mapUtil(Map<Integer, String> map) {
        // Add key-value pairs
        map.put(101, "Steve");
        map.put(502, "Roger");
        map.put(22, "Jennifer");
        map.put(36, "Mika");
        map.put(750, "Kelly");
        // expose / access elements
        System.out.println("See all the keys: " + map.keySet());
        System.out.println("See all key-value: : " + map);
        System.out.println(map.get(502));

        // Iterate through map of key-value pairs
        for (int key : map.keySet()) {
            System.out.println("[KEY: " + key + ". VALUE: " + map.get(key) + " ]");
        }


    }


}
