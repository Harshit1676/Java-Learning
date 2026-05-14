// import java.util.*;
// public class MaxSubArray {
//     public static void Max_Sub_Array(int num[]){
//         int maxSum = Integer.MIN_VALUE;
//         int ts = 0;
//         int CurrSum = 0;
//         for(int i = 0 ; i < num.length ; i++){
//             int start = i;
//             for(int j = i; j < num.length; j++){
//                 int end = j;
//                 CurrSum = 0;
//                 for(int k = start; k <= end ; k++){
//                     CurrSum += num[k];
//                 }
//                 System.out.println(CurrSum);
//                 if(maxSum < CurrSum){
//                     maxSum = CurrSum;
//                 }
//                 // System.out.println();
//                 // System.out.println("Sum : "+sum);
//                 // ts++;
//             }
//             System.out.println();
//         }
//         System.out.println("Maximum sum is: "+maxSum);
//         // System.out.println("Total subarrys are : "+ts);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size : ");
//         int size = sc.nextInt();

//         System.out.print("Enter elements: ");
//         int[] num = new int[size];
//         for(int i = 0; i < size; i++){
//             num[i] = sc.nextInt();
//         }
//         Max_Sub_Array(num);
//     }
// }
