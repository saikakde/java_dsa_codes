package Arraylists;

import java.util.*;

public class MonotoneArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // increasing order
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);

        // decreasing order
        // list.add(5);
        // list.add(5);
        // list.add(4);
        // list.add(3);
        // list.add(3);
        // list.add(1);
        System.out.println(monotoneArrayList(list));
    }

    public static boolean monotoneArrayList(ArrayList<Integer> list){
        boolean inc=true;
        boolean dec=true;
        for(int i=0;i<list.size()-1;i++) {
            if(list.get(i) >list.get(i+1))
            inc=false;
            if(list.get(i) <list.get(i+1))
            dec=false;
        }
        return inc||dec;
        // return result;
    }

}
