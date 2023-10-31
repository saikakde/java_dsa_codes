package GreedyAlgo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class IndianCoins {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Integer coins[] = { 1, 2, 5, 10, 20, 100,50, 500, 1000, 2000 };
        System.out.print("enter the amount:");
        int amount = sc.nextInt();
        int count = 0;

        Arrays.sort(coins,Comparator.reverseOrder());

        int i=0;
        while(amount!=0 && i<coins.length){
            if(amount>=coins[i]){
                amount-=coins[i];
                count++;
            }
            else{
                i++;
            }
        }
        System.out.println(count);
        sc.close();
        
    }
// Shradha's approach
    //     Arrays.sort(coins, Comparator.reverseOrder());
    //     int amount = 590;
    //     int countOfCoins = 0;
    //     for (int i = 0; i < coins.length; i++) {
    //         if (amount >= coins[i]) {
    //             while (amount >= coins[i]) {
    //                 amount -= coins[i];
    //                 countOfCoins++;
    //             }
    //         } 
    //     }
    //     System.out.println(countOfCoins);
    // }

}
