package Arraylists;

import java.util.ArrayList;

public class PairSum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        pairSum(list, 6);
        
    }

    public static void pairSum(ArrayList<Integer> list, int key) {
        int lp = 0, rp = list.size() - 1;
        boolean result = false;
        while (lp < rp) {
            // System.out.println("pairs doesnt exist");
            if (list.get(rp) + list.get(lp) == key) {
                System.out.println(list.get(lp) + " " + list.get(rp));
                result = true;
            }
            if (list.get(rp) + list.get(lp) < key) {
                lp++;
            } else {
                rp--;
            }
        }
        // return result;
        if(result==false){
            System.out.println("pairs doesnt exist");
        }
    }
}