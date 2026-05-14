// import java.util.*;
// public class DiagonalSum {
//     public static int diagonal_Sum(int matrix[][]){ 
//         int sum = 0;
//         // this code is not much optamized the time complexity is worse that is: Time Complexity = O(n^2)

//         // for(int i = 0; i<matrix.length; i++){
//         //     for(int j = 0; j < matrix[0].length; j++){
//         //         if(i == j){
//         //             sum += matrix[i][j];
//         //         }else if(i+j == matrix.length -1){
//         //             sum += matrix[i][j];
//         //         }
//         //     }
//         // }
//         // return sum;
        
//         int n = matrix.length;
//         for(int i =0 ;i < n; i++){ // Time complexity O(n);
//             sum += matrix[i][i];
//             if(i != n-i-1){
//                 sum += matrix[i][n-i-1];
//             }
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int[][] matrix = new int[n][n];
//         for(int i = 0; i < n; i++){
//             for(int j = 0 ; j < n; j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         System.out.print("Sum of diagonal is: "+diagonal_Sum(matrix));
//     }
// }