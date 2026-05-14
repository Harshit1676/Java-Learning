// import java.util.Arrays;

// public class BinarySearch {
//     public static int binarySearch(int numbers[], int key){
//         int start = 0, end  = numbers.length-1;

//         while(start <= end){
//             int mid  = (start + end)/2;
//             if(numbers[mid] == key){
//                 return mid;
//             }
//             if(numbers[mid] < key){
//                 start = mid +1;
//             }
//             if(numbers[mid] > key){
//                 end  = mid -1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int numbers[] = {64,45,78,95,47,65,23};
//         int key = 65;
//         Arrays.sort(numbers);
//         int index = binarySearch(numbers, key);
//         System.out.println("Element found at index: "+index);
//     }
// }
