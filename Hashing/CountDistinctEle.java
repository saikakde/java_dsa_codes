package Hashing;

import java.util.HashSet;

public class CountDistinctEle {
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,6,8,5,3};

        HashSet<Integer> set = new HashSet<>();
        for(int a: arr){
            set.add(a);
        }
        System.out.println(set);
    }
}
