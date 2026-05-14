// Very Important question

import java.util.*; 
public class SpiralMatrix {
    public static void Spiral_Matrix(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        
        while(startRow <= endRow && startCol <= endCol){
            // Top
            for(int j = startCol; j <= endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            // Right
            for(int i = startRow+1; i <= endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            // Bottom
            for(int j = endCol - 1; j >= startCol; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            // Left
            for(int i = endRow-1; i >= startRow+1; i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        Spiral_Matrix(matrix);
    }
}
