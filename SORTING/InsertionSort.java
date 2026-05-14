// import java.util.*;
// public class InsertionSort {
//     public static void Insertion_Sort(int arr[]){

//         int n = arr.length;
//         for(int i = 1; i < n; i++){
//             int curr = arr[i] ;
//             int prev = i - 1;
//             // Finding out the correct position to insert 
//             while(prev >= 0 && arr[prev] > curr){
//                 arr[prev+1] = arr[prev];
//                 prev--;
//             }
//             // Insertion
//             arr[prev+1] = curr;
//         }
//     }
//     public static void PrintArr(int arr[]) {
//         for(int i = 0 ; i < arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size: ");
//         int size = sc.nextInt();

//         System.out.print("Enter elements: ");
//         int[] arr = new int[size];
//         for(int i = 0; i < size; i++){
//             arr[i] = sc.nextInt();
//         }
//         Insertion_Sort(arr);
//         PrintArr(arr);
//     }
// }


