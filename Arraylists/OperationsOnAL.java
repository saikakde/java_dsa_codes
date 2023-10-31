package Arraylists;
import java.util.*;
public class OperationsOnAL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // function to print the arraylist
        printArrayList(list);

        reverseArrayList(list);

        // swapping ArrayList using the index values
        swapArrayList(list,0,4);
        printArrayList(list);
        
        // reversing using Colletions.sort()
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }

    public static void printArrayList(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }

    public static void reverseArrayList(ArrayList<Integer> list){
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }

    public static void swapArrayList(ArrayList<Integer> list,int x,int y){
        int temp = list.get(x);
        list.set(x, list.get(y));
        list.set(y, temp);
    }
}
