// import java.util.Scanner;
// public class Circle {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the radius of the circle: ");
//         int radius = scanner.nextInt();
//         scanner.close();

//         int centerX = radius;
//         int centerY = radius;

//         for (int i = 0; i <= 2 * radius; i++) {
//             for (int j = 0; j <= 2 * radius; j++) {
//                 int distance = (int) Math.sqrt(Math.pow(i - centerX, 2) + Math.pow(j - centerY, 2));
//                 if (distance <= radius) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


import java.util.Scanner;

public class Circle {
    
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the hollow circle: ");
        int radius = scanner.nextInt();
        scanner.close();

        for (int i = -radius; i <= radius; i++) {
            for (int j = -radius; j <= radius; j++) {
                double distance = Math.sqrt(i * i + j * j);
                if (Math.abs(distance - radius) < 0.5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }}
}



