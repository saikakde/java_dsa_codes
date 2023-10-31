package Arraylists;

import java.util.ArrayList;

public class MaxOfArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(9);
        list.add(10);
        list.add(2);
        list.add(5);
        list.add(3);

        printArrayList(list);
        maxOfArrayList(list);
        minOfArrayList(list);
    }
    public static void printArrayList(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }

    public static void maxOfArrayList(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max = list.get(i);
            }
        }
        System.out.println(max);
    }
    public static void minOfArrayList(ArrayList<Integer> list){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++){
            if(min>list.get(i)){
                min = list.get(i);
            }
        }
        System.out.println(min);
    }

}