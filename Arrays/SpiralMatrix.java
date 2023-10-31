package Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int matrix[][] =    {{1,2,3,4},
                            {12,13,14,5},
                            {11,16,15,6},
                            {10,9,8,7}};
                        
        rotateMatrix(matrix);
    }
    public static void rotateMatrix(int matrix[][]){
        int topRow =0,bottomRow=matrix.length-1,leftCol = 0,rightCol=matrix[0].length-1;

        while(topRow<=bottomRow && leftCol<=rightCol){
        // top
        for(int i=leftCol;i<=rightCol;i++){
            System.out.print(matrix[topRow][i]+" ");
        }
        // right
        for(int i=topRow+1;i<=bottomRow;i++){
            System.out.print(matrix[i][rightCol]+" ");
        }
        // bottom
        for(int i=rightCol-1;i>=leftCol;i--){
            if(rightCol==leftCol){
                return;
            }
            System.out.print(matrix[bottomRow][i]+" ");
        }
        // left
        for(int i=bottomRow-1;i>=topRow+1;i--){
            if(bottomRow==topRow){
                return;
            }
            System.out.print(matrix[i][leftCol]+" ");
        }

        topRow++;
        bottomRow--;
        leftCol++;
        rightCol--;
        }
    }
}
