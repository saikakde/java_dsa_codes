package Hashing;

import java.util.HashSet;

public class UnionAndInters {
    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (Integer a1 : arr1) {
            set1.add(a1);
        }
        for (Integer a2 : arr2) {
            set2.add(a2);
        }

        HashSet<Integer> union = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        union = set1;
        for (Integer ele : set2) {
            if (set1.contains(ele) == false) {
                union.add(ele);
            } else {
                intersection.add(ele);
            }
        }
        System.out.println("Union : " + union);
        System.out.println("Intersection : " + intersection);

    }
}
