// import java.util.*;
// public class PAIRS {
//     public static void PrintPairs(int num[]){
//         int totalpairs = 0;

//         for(int i = 0 ; i < num.length ; i++){
//             int curr = num[i];
//             for(int j = i + 1; j < num.length ; j++){
//                 System.out.print("("+curr+","+num[j]+")");
//                 totalpairs++;
//             }
//             System.out.println();
//         }
//         System.out.println("Total pairs ="+ totalpairs);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size");
//         int size  = sc.nextInt();

//         System.out.print("Enter elements: ");
//         int[] num = new int[size];
//         for(int i = 0 ;i < size; i++){
//             num[i] = sc.nextInt();
//         }
//         PrintPairs(num);
//     }
// }