// import java.util.*;

// public class LINEARSEARCH {
//     public static int linearsearch(int numbers[], int key, int size) {
//         for (int i = 0; i < numbers.length; i++) {
//             if (numbers[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of the array: ");
//         int size = sc.nextInt();
//         System.out.println();

//         int[] numbers = new int[size];
//         System.out.print("Enter elements: ");
//         for (int i = 0; i < size; i++) {
//             numbers[i] = sc.nextInt();
//         }

//         System.out.print("\nEnter element to be searched: ");
//         int key = sc.nextInt();
//         System.out.println();

//         int index = linearsearch(numbers, key, size);
//         if (index == -1) {
//             System.out.println("Not found");
//         } else {
//             System.out.println("Key is at index " + index);
//         }

//         sc.close();
//     }
// }




// public class LINEARSEARCH {
//     public static int linearsearch(int numbers[], int key) {
//         for(int i = 0; i < numbers.length; i++){
//             if(numbers[i] == key){
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int numbers[] = {1,2,3,5,8,9,10,15,18};
//         int key = 10;
//         int index = linearsearch(numbers, key);
//         if(index == -1){
//             System.out.print("key not found");
//         }else{
//             System.out.println("Key is found at index: "+index);
//         }
//     }
// }


