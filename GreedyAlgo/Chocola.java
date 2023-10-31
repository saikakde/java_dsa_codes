package GreedyAlgo;

import java.util.Arrays;
import java.util.Comparator;

public class Chocola {
    public static void main(String[] args) {
        // int n = 4,m=6; if we want to make custom size and input for below 2 arrays
        Integer costVer[] = {2,1,3,1,4};
        Integer costHor[] = {4,1,2};

        Arrays.sort(costVer, Comparator.reverseOrder());
        Arrays.sort(costHor, Comparator.reverseOrder());

        int h=0,v=0;
        int hp =1,vp=1;
        int cost=0;

        while(h<costHor.length && v<costVer.length){
            if(costHor[h]>=costVer[v]){
                cost = cost+costHor[h]*vp;
                h++;
                hp++;
            }else{
                cost = cost+costVer[v]*hp;
                v++;
                vp++;
            }
        }
        while(h<costHor.length){
            cost = cost+costHor[h]*vp;
                h++;
                hp++;
        }
        while(v<costVer.length){
            cost = cost+costVer[v]*hp;
                v++;
                vp++;
        }
        System.out.println("cost : "+cost);


    }
    
}
