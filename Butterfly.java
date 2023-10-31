import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int i=1;i<=size;i++){
            // for(int j=1;j<=i;j++){
            //     System.out.print('*');
            // }
            for(int j=1;j<=(size-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }

        // for(int i=size;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print('*');
        //     }
        //     for(int j=1;j<=2*(size-i);j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print('*');
        //     }
        //     System.out.println();
        // }

        sc.close();
    }
    
}
