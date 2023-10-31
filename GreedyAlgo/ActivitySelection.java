package GreedyAlgo;

import java.util.*;

// import Arrays.Arrays;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        int sortedEnd[][] = new int[start.length][3];
        for(int i =0;i<start.length;i++){
            sortedEnd[i][0] = i;
            sortedEnd[i][1] = start[i];
            sortedEnd[i][2] = end[i];
        }
        
        Arrays.sort(sortedEnd,Comparator.comparingInt(o ->o[2]));

        ArrayList<Integer> ans = new ArrayList<>();
        
        int maxAct = 1;
        int nextAct = sortedEnd[0][2];
        ans.add(sortedEnd[0][0]);
        for(int i=1;i<end.length;i++){
            if(sortedEnd[i][1]>nextAct){
                maxAct++;
                ans.add(sortedEnd[i][0]);
                nextAct = sortedEnd[i][2];
            }
        }
        System.out.println("total activities are: "+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();


    }
    
}
