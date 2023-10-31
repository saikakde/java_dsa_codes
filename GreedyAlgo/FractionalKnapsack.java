package GreedyAlgo;

import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int weights[] = { 10, 20, 30 };
        int value[] = { 60, 100, 120 };
        int capacity = 50;

        int maxVal= 0;

        double arr[][] = new double[weights.length][value.length];
        
        for(int i=0;i<weights.length;i++){
            arr[i][0] = (double)value[i]/weights[i];
            arr[i][1] = weights[i];
            arr[i][2] = value[i];
        }
        Arrays.sort(arr,Comparator.comparingDouble(o->o[0]));

        for(int i=arr.length-1;i>=0;i--){
            if(capacity>=arr[i][1]){
                maxVal +=arr[i][2];
                capacity-=arr[i][1];
            }else{
                maxVal +=arr[i][0]*capacity;
                capacity=0;
            }
        }
        System.out.println("maxVal:"+maxVal);
    }
}
// Shradha's approach
    //     int maxValue = 0;
    //     double ratio[][] = new double[weights.length][2];

    //     for (int i = 0; i < value.length; i++) {
    //         ratio[1][0] = i;
    //         ratio[i][1] = value[i] / (double) weights[i];
    //     }

    //     Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

    //     for (int i = ratio.length - 1; i >= 0; i--) {
    //         int index = (int) ratio[i][0];
    //         if (weights[index] <= capacity) {
    //             maxValue += value[index];
    //             capacity -= weights[index];
    //         } else {
    //             maxValue += ratio[i][1] * capacity;
    //             capacity = 0;
    //             break;
    //         }
    //     }
    //     System.out.println(maxValue);
    // }
// }
