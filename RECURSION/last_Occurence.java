// public class last_Occurence {
//     public static int Last_Occurence(int arr[],int key,int i){
//         if(i == arr.length){
//             return -1;
//         }
//         int isFound = Last_Occurence(arr, key, i+1);
//         if(isFound == -1 && arr[i] == key){
//             return i;
//         }
//         return isFound;
//     }
//     public static void main(String[] args) {
//         int arr[] = {1,2,34,5,56,7,8,2,34};
//         int key = 34;
//         System.out.println(Last_Occurence(arr, key,0));
//     }
// }
