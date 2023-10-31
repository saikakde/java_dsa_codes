package Heaps;

import java.util.ArrayList;

public class Heaps {
    ArrayList<Integer> arr = new ArrayList<>();
    public void add(int data){ //O(logn)
        // add at last index
        arr.add(data);

        int x = arr.size()-1;//x is child index
        int par = (x-1)/2;//par index

        while(arr.get(x) < arr.get(par)){ //O(logn)
            // swap
            int temp = arr.get(x);
            arr.set(x,arr.get(par));
            arr.set(par, temp);

            x=par;
            par=(x-1)/2;
        }
    }
    public int peek(){
        return arr.get(0);
    }

    private void heapify(int i){
        int left = 2*i+1;
        int right = 2*i+2;
        int minIndex = i;

        if(left<arr.size() && arr.get(minIndex)>arr.get(left)){
            minIndex = left;
        }
        if(right<arr.size() && arr.get(minIndex)>arr.get(right)){
            minIndex = right;
        }

        if(minIndex != i){
            // swap
            int temp = arr.get(i);
            arr.set(i,arr.get(minIndex));
            arr.set(minIndex,temp);

            heapify(minIndex);
        }
    }

    public int remove(){
        int data = arr.get(0);

        // step1 - swap first & last
        int temp = arr.get(0);
        arr.set(0,arr.get(arr.size()-1));
        arr.set(arr.size()-1,temp);

        // step2 - delete last
        arr.remove(arr.size()-1);

        // step3 - heapify
        heapify(0);
        return data;
    }

    public boolean isEmpty(){
        return arr.size() == 0;
    }

    public static void main(String[] args) {
        Heaps hp = new Heaps();
        hp.add(1);
        hp.add(5);
        hp.add(2);
        hp.add(10);
        hp.add(4);

        // System.out.println(hp.peek());
        // hp.remove();
        // System.out.println(hp.peek());       
        while(!hp.isEmpty()){
            System.out.print(hp.peek()+" ");
            hp.remove();
        } 
        
    }
}
