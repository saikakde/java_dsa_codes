// package RecursionQuestions.java;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int disks = sc.nextInt();
        
        towerOfHanoi(disks,'A','C','B');
        sc.close();
    }
    public static void towerOfHanoi(int n,char A,char C,char B){
        if(n == 1){
            System.out.println("Move disk 1 from rod "+A+" to rod "+ C);
            return;
        }
        towerOfHanoi(n-1, A, B, C);
        System.out.println("Move disk "+n+" from rod "+A+" to rod "+ C);
        towerOfHanoi(n-1, B, C, A);
    }
}
