// import java.util.*;
// public class BubbleSort {
//     public static void bubble_sort(int sort[]){
//         int n = sort.length;

//         for(int i = 0; i < n ; i++){
//             for(int j = 0 ; j < n-1-i ; j++){

//                 if(sort[j] > sort[j+1]){

//                 int temp = sort[j];
//                 sort[j] = sort[j+1];
//                 sort[j+1] = temp;

//                 }

//             }
//         }
//     }
//     public static void printSortedArray(int sort[]) {
//         for(int i = 0 ; i < sort.length; i++){
//             System.out.print(sort[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size: ");
//         int size = sc.nextInt();

//         System.out.print("Enter elements: ");
//         int[] sort = new int[size];
//         for(int i = 0 ; i < size ; i++){
//             sort[i] = sc.nextInt();
//         }

//         bubble_sort(sort);
//         printSortedArray(sort);

//     }
// }
