// // import java.util.*;
// // public class Practice {
// //     public static void PrefixSum(int num[]){

// //         int currSum = 0;
// //         int maxSum = Integer.MIN_VALUE;

// //         int[] prefix = new int[num.length];
// //         prefix[0] = num[0];

// //         for(int i = 1; i < prefix.length; i++){
// //             prefix[i] = prefix[i-1] + num[i];
// //         }

// //         for(int i = 0; i < num.length; i++){
// //             int start = i;
// //             for(int j = i ; j < num.length; j++){
// //                 int end = j;
// //                 currSum = start==0?prefix[end]:prefix[end] - prefix[start-1];
// //                 if(maxSum < currSum){
// //                     maxSum = currSum;
// //                 }
// //             }
// //         }
// //         System.out.println("Maximum sum is: "+maxSum);
// //     }
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);

// //         System.out.print("Size: ");
// //         int size = sc.nextInt();

// //         System.out.println("Enter the elements: ");
// //         int[] num = new int[size];
// //         for(int i = 0; i < size; i++){
// //             num[i] = sc.nextInt();
// //         }
// //         PrefixSum(num);
// //     }
// // }



// // Trapping Rain water problem 

// // import java.util.*;
// // public class Practice {
// //     public static int trappedWater(int height[]){
// //         int n = height.length;
// //         //First calculate leftmax

// //         int[] leftmax = new int[n];
// //         leftmax[0] = height[0];
// //         for(int i = 1; i < n; i++){
// //             leftmax[i] = Math.max(height[i],leftmax[i-1]);
// //         }
// //         // second calculate rightmax

// //         int[] rightmax = new int[n];
// //         rightmax[0] = height[0];
// //         for(int i = n - 2; i >=0 ; i--){
// //             rightmax[i] = Math.max(height[i],rightmax[i+1]);
// //         }

// //         // loop for finding the trapped water

// //         int waterTrapped = 0;
// //         for(int i = 0; i < n; i++){

// //             // waterlevel = min(leftmax, rightmax)
// //             int waterlevel = Math.min(leftmax[i],rightmax[i]);
// //             // watertrapped  = waterlevel - height
// //             waterTrapped += waterlevel - height[i];
// //         }
// //         return waterTrapped;
// //     }
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);

// //         System.out.print("Size: ");
// //         int size  = sc.nextInt();

// //         System.out.print("Enter "+size+" elements");
// //         int[] height = new int[size];
// //         for(int i = 0; i < size; i++){
// //             height[i] = sc.nextInt();
// //         }
// //         System.out.println(trappedWater(height));
// //     }
// // }


// public class SearchInSorted {
//     public static boolean StairCaseSearch(int matrix[][], int key){
//         int row = 0, col = matrix[0].length-1;
//         while(row < matrix.length && col >= 0){
//             if(matrix[row][col] == key){
//                 System.out.println("Found key at ("+row+","+col+")");
//                 return true;
//             }
//             else if(key < matrix[row][col]){
//                 col--;
//             }
//             else{
//                 row++;
//             }
//         }
//         System.out.println("Key not found!");
//         return false;
//     }
//     public static void main(String[] args) {
//         int matrix[][] = {{10, 20, 30, 40},
//                           {15, 25, 35, 45},
//                           {27, 29, 37, 48},
//                           {32, 33, 39, 50}};
//         int key = 33;
//         StairCaseSearch(matrix, key);
//     }
// }
