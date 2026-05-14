// import java.util.*;
// public class Max_Sub_Array_Prefix {
//     public static void prefix_Max_sum(int num[]) {

//         int CurrSum = 0;
//         int maxSum = Integer.MIN_VALUE;

//         int prefix[] = new int[num.length];
//         prefix[0] = num[0];

//         for(int i = 1 ; i < prefix.length; i++){
//             prefix[i] = prefix[i-1]  + num[i];
//         }

//         for(int i = 0; i < num.length; i++){
//             int start = i;

//             for(int j = i; j < num.length; j++){

//                 int end = j;
//                 CurrSum = start == 0? prefix[end]:prefix[end] - prefix[start-1];

//                 System.out.println(CurrSum);
//                 if(maxSum < CurrSum){
//                     maxSum = CurrSum;
//                 }
//             }
//         }
//         System.out.print("Max sum: "+maxSum);
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

//         prefix_Max_sum(num);
//     }
// }