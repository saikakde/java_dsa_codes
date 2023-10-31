package Hashing;

import java.util.*;
// import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        // HashSet<Integer> set = new HashSet<>();
        // set.add(1);
        // set.add(2);
        // set.add(3);
        // set.add(1);
        // set.add(4);

        // System.out.println(set);

        // // Iterator<Integer> it = set.iterator();

        // // while(it.hasNext()){
        // //     System.out.println(it.next());
        // // }

        // // System.out.println("_____");

        // // for(Integer num:set){
        // //     System.out.println(num);
        // // }

        // // System.out.println(set);
        // // System.out.println(set.size());
        // // System.out.println(set.isEmpty());
        // // System.out.println(set.contains(1));

        // // set.remove(1);
        // // System.out.println(set);
        // // System.out.println(set.contains(1));

        // // set.clear();
        // // System.out.println(set);
        // // System.out.println(set.isEmpty());

        // // -------------------------------------------------

        // LinkedHashSet<Integer> lset = new LinkedHashSet<>();
        // lset.add(1);
        // lset.add(2);
        // lset.add(3);
        // lset.add(1);

        // System.out.println(lset);
        // other functions are same as hashset

        // ----------------------------------------------------
        
        // diference between HashSet, LinkedHashSet and TreeSet is
        // HashSet does not follow any order for arranging
        // LinkedHashSet follow the order for arranging same as the order of elements being added
        // TreeSet arranges in ascending order


        HashSet<String> set = new HashSet<>();
        set.add("Mumbai");
        set.add("Delhi");
        set.add("Pune");
        set.add("Hyderabad");

        System.out.println(set);

        LinkedHashSet<String> lset = new LinkedHashSet<>();
        lset.add("Mumbai");
        lset.add("Delhi");
        lset.add("Pune");
        lset.add("Hyderabad");

        System.out.println(lset);

        TreeSet<String> tset = new TreeSet<>();
        tset.add("Mumbai");
        tset.add("Delhi");
        tset.add("Pune");
        tset.add("Hyderabad");

        System.out.println(tset);
    }
}
