// import java.util.Scanner;

// public class REVERSE {
//     public static void reverse(int numbers[]){
//         int first = 0, last = numbers.length-1;

//         while(first < last){

//             //SWAP

//             int temp = numbers[last];
//             numbers[last] = numbers[first];
//             numbers[first] = temp;

//             first++;
//             last--;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of an array: ");
//         int size  = sc.nextInt();

//         System.out.print("Enter elements: ");
//         int[] numbers = new int[size];
//         for(int i = 0 ; i < size; i++){
//             numbers[i] = sc.nextInt();
//         }
//         reverse(numbers);
//         for(int i = 0 ; i < numbers.length; i++){
//             System.out.print(numbers[i]+" ");
//         }
//     }
// }


