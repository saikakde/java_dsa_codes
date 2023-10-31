package Hashing;

import java.util.*;
import java.util.TreeMap;

public class HashMapJcf {
    public static void main(String[] args) {
        // key:value are in random order
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Sai", 98);
        hm.put("Nikhil", 97);
        hm.put("Shiv", 96);
        
        System.out.println(hm);

        // key:value are in same order as they are added
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("Sai", 98);
        lhm.put("Nikhil", 97);
        lhm.put("Shiv", 96);
        lhm.put("Ram", 99);
        
        System.out.println(lhm);

        // key:value are ordered according to the keys
        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("Sai", 98);
        tm.put("Nikhil", 97);
        tm.put("Shiv", 96);
        tm.put("Ram", 99);
        
        System.out.println(tm);

    }
}
