// import java.util.*;
// public class SelectionSort {
//     public static void selection_sort(int arr[]){
//         int n = arr.length;
//         for(int i = 0 ; i < n-1; i++){
//             int minPos = i;
//             for(int j=i+1; j < n ; j++){
//                 if(arr[minPos] > arr[j]){
//                     minPos = j;
//                 }
//             }
//             //Swap
//             int temp = arr[minPos];
//             arr[minPos] = arr[i];
//             arr[i] = temp;
//         }
//     }
//     public static void PrintArr(int arr[]) {
//         for(int i = 0;i < arr.length; i++){
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
//         for(int i = 0 ; i < size; i++){
//             arr[i] = sc.nextInt();
//         }
//         selection_sort(arr);
//         PrintArr(arr);
//     }
// }
