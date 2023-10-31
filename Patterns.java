import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // // code for pyramid
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=1;j<=2*i-1;j++){
        //         System.out.print('*');
        //     }
        //     System.out.println();
        // }

        // // code for inverted pyramid
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=1;j<=2*i-1;j++){
        //         System.out.print('*');
        //     }
        //     System.out.println();
        // }

        // this code prints pattern like 1 23 456
        int x=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(x+" ");
                x+=1;
            }
            System.out.println();
        }

        // // this code prints pattern like 1 01 101 0101
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         if((i+j)%2==0){
        //             System.out.print('1');
        //         }else{
        //             System.out.print('0');
        //         }
        //     }
        //     System.out.println();
        // }

        // int x = sc.nextInt();
        // for(int i=1;i<=x;i++){
        //     below code will reverse the order of n-1 th line and print in the nth line eg: 1 12 123 321
        //     if(i!=x){
        //     for(int j=1;j<=i;j++){
        //             System.out.print(j);
        //         }
        //     }
        //         else{
        //     for(int j=1;j<i;j++){
        //             System.out.print(x-j);
        //         }
        //     }
        //     System.out.println();

            // below code will reverse the order of the last line eg: 1 12 123 4321
        //     for(int j=1;j<=i;j++){
        //         if(i!=x){
        //             System.out.print(j);
        //         }else{
        //             System.out.print(x-j+1);
        //         }
        //     }
        //     System.out.println();
        // }
        sc.close();
    }
}
