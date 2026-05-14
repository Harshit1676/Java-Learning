// public class Largest&Smallest {
//     public static int largest(int numbers[]){
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;
//         for(int i = 0; i < numbers.length; i++){
//             if(largest < numbers[i]){
//                 largest = numbers[i];
//             }
//             if(smallest > numbers[i]){
//                 smallest = numbers[i];
//             }
//         }
//         System.out.println("Smallest value is: "+smallest);
//         return largest;
//     }
//     public static void main(String[] args) {
//         int numbers[] = {1,4,5,6,7,9,14,2};
//         System.out.println("Largest number: "+largest(numbers));
//     }
// }