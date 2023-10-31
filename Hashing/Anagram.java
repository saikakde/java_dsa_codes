package Hashing;

import java.util.*;

public class Anagram {
    public static boolean anagram(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }
        System.out.println(hm);

        for (int i = 0; i < t.length(); i++) {
            char ch2 = t.charAt(i);
            if (hm.containsKey(ch2)) {
                if (hm.get(ch2) == 1) {
                    hm.remove(ch2);
                } else {
                    hm.put(ch2, hm.get(ch2) - 1);
                }
            } else {
                return false;
            }
        }
        return hm.isEmpty();
    }

    public static void main(String[] args) {

        String s = "cart";
        String t = "acrt";

        System.out.println(anagram(s, t));

    }

}
