// VERY IMPORTANT

// import java.util.*;
// public class Kadane {
//     public static void kadanes(int num[]){
//         int maxSum = Integer.MIN_VALUE;
//         int currSum = 0;

//         for(int i = 0; i < num.length; i++){
//             currSum = currSum + num[i];
//             if(currSum < 0){
//                 currSum = 0;
//             }
//             maxSum = Math.max(currSum,maxSum);
//         }
//         System.out.println("Our maximum subArray sum is: "+maxSum);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of the array: ");
//         int size = sc.nextInt();

//         System.out.print("Enter elements os an array: ");
//         int[] num = new int[size];
//         for(int i = 0;i < size; i++){
//             num[i] = sc.nextInt();
//         }
//         kadanes(num);
//     }
// }
