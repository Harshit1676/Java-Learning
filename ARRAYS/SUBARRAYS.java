// import java.util.*;
// public class SUBARRAYS {
//     public static void SubArray(int num[]){
//         int totalSubarray = 0;
//         for(int i = 0 ; i < num.length; i++){
//             int start = i;
//             for(int j = i; j < num.length; j++){
//                 int end  = j;
//                 int sum = 0;
//                 for(int k = start ; k <= end; k++){ //Print
//                     System.out.print(num[k]+" ");  // SubArrays
//                     sum += num[k]; // sum of subArrays
//                 }
//                 System.out.println();
//                 System.out.println("Sum is: "+sum);
//                 totalSubarray++;
//             }
//             System.out.println();
//         }
//         System.out.println(totalSubarray);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size : ");
//         int size  = sc.nextInt();
        
//         System.out.print("Enter elements: ");
//         int[] num = new int[size];
//         for(int i = 0 ; i < size ; i++){
//             num[i] = sc.nextInt();
//         }
//         SubArray(num);
//     }
// }