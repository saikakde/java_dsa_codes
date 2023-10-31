package Hashing;

import java.util.*;

public class SortByFreq {
    // need some changes 
    public static void sortBYFreq(String str) {
        TreeMap<Character, Integer> hm = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }
        System.out.println(hm);
        Set<Character> set = hm.keySet();

        System.out.println(set);

        String st = "";
        for (Character ch1 : set) {
            int count = hm.get(ch1);
            while (count != 0) {
                st = st + ch1;
                count--;
            }
        }
        System.out.println(st);
    }
    
    // Shradhas logic
    public static String sortBYFreqk(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); ++i)
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
                (a, b) -> a.getValue() == b.getValue() ? a.getKey() - b.getKey() : b.getValue() - a.getValue());
        for (Map.Entry<Character, Integer> e : map.entrySet())
            pq.add(e);

        StringBuilder res = new StringBuilder();
        while (pq.size() != 0) {

            char ch = pq.poll().getKey();
            int val = map.get(ch);
            while (val != 0)

            {
                res.append(ch);
                val--;
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
       // String str = "tree";
        String str = "gvvggvvggvvghghgfggfhhhjhjjjjkhjhgglkjhgfdgv";
        sortBYFreq(str);
        System.out.println(sortBYFreqk(str));
    }
}
