// import java.util.*;
// public class InBuiltSort {
//     public static void Inbuilt_sort(Integer arr[]) {
//         Arrays.sort(arr, Collections.reverseOrder());
//     }
//     public static void PrintArr(Integer arr[]){
//         for(int i = 0 ; i  < arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static int compare(int a, int b){
//         return a-b;
//     }
//     public static void main(String[] args) {
//         Scanner Sc = new Scanner(System.in);

//         System.out.print("Size: ");
//         int size = Sc.nextInt();
//         int a = Sc.nextInt();
//         int b = Sc.nextInt();

//         System.out.print("Enter unsorted array: ");
//         Integer[] arr = new Integer[size];
//         for(int i = 0; i < size; i++){
//             arr[i] = Sc.nextInt();
//         }
//         Inbuilt_sort(arr);
//         PrintArr(arr);
//         System.out.println(compare(a, b));
//     }
// }