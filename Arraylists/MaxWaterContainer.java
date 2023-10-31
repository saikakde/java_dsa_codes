package Arraylists;

import java.util.ArrayList;

public class MaxWaterContainer{
    public static void main(String[] args) {
        ArrayList<Integer> heights = new ArrayList<>();
        // 1 8 6 2 5 4 8 3 7
        heights.add(1);
        heights.add(8);
        heights.add(6);
        heights.add(2);
        heights.add(5);
        heights.add(4);
        heights.add(8);
        heights.add(3);
        heights.add(7);

        maxWater(heights);

        // int maxWater = Integer.MIN_VALUE;
        // for(int i=0;i<heights.size();i++){
        //     for(int j=i+1;j<heights.size();j++){
        //         int height = Math.min(heights.get(i), heights.get(j));
        //         int width = j-i;
        //         int water = height*width;

        //         if(maxWater<water){
        //             maxWater = water;
        //         }
        //     }
        // }
        // System.out.println(maxWater);
    }

    public static void maxWater(ArrayList<Integer> heights){
        int leftPointer = 0,rightPointer= heights.size()-1;

        int maximumWater = 0;
        while(leftPointer<rightPointer){
            int height = Math.min(heights.get(leftPointer), heights.get(rightPointer));
            int width = rightPointer-leftPointer;
            int water = height*width;

            maximumWater = Math.max(maximumWater, water);
            
            if(heights.get(leftPointer)<heights.get(rightPointer)){
                leftPointer++;
            }else{
                rightPointer--;
            }
        }
        System.out.println(maximumWater);
    }
}