package Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};
    
        searchKey(matrix, 10);
    }

    public static boolean searchKey(int matrix[][], int key) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int x = 0;
        int y = cols - 1;
        System.out.println(y);

        while (x < rows && y >= 0) {
            int current = matrix[x][y];
            if (key == current) {
                System.out.println("Key found at position: (" + x + ", " + y + ")");
                return true;
            } else if (key < current) {
                y--;
            } else {
                x++;
            }
        }

        System.out.println("Key not found");
        return false;
    }
}
