public class PrActice {

    public static int Stocks(int arr[]){
        int maxProfit = 0;
        int buyPrices = Integer.MAX_VALUE;

        for(int i=0;i<arr.length-1;i++){
            if(buyPrices<arr[i]){
                int profit = arr[i]-buyPrices;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrices = arr[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = {10,15,20,25};
        System.out.println(Stocks(arr));
    }

    // public static void Max_Sub(int arr[]){
    //     int max = Integer.MIN_VALUE;
    //     int currSum = 0;
    //     int ts = 0;
    //     for(int i = 0;i<arr.length;i++){
    //         int start = i;
    //         for(int j=i;j<arr.length;j++){
    //             int end = j;
    //             currSum= 0;
    //             for(int k = start;k<=end;k++){
    //                 currSum += arr[k];
    //                 ts++;
    //             }
    //             System.out.println(currSum);
                
    //         }
    //     }
    //     // System.out.println(ts);
    // }
    // public static void main(String[] args) {
    //     int arr[] = {1,2,3,4,5,6};
    //     Max_Sub(arr);
    // }

    // public static void Pairs(int arr[]){
    //     int totalpairs=0;
    //     for(int i=0;i<arr.length;i++){
    //         int curr = arr[i];
    //         for(int j = i+1;j<arr.length;j++){
    //             System.out.print("("+curr+","+arr[j]+")");
    //             totalpairs++;
    //         }
    //         System.out.println();
    //     }
    //     System.out.println(totalpairs);
    // }
    // public static void main(String[] args) {
    //     int arr[] = {1,2,3,4,5,6,7,8,9};
    //     Pairs(arr);
    // }





    // public static int Linear(int arr[],int key){
    //     for(int i = 0;i <= arr.length-1;i++){
    //         if(arr[i] == key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // public static void main(String args[]){
    //     int key = 8;
    //     int arr[]= {1,5,6,7,8,9};
    //     System.out.println(Linear(arr,key));
    // }





    // public static void Max_Min(int num[]){
    //     int max = Integer.MIN_VALUE;
    //     int min = Integer.MAX_VALUE;

    //     for(int i = 0; i< num.length;i++){
    //         if(max<num[i]){
    //             max = num[i];
    //         }
    //         if(min>num[i]){
    //             min = num[i];
    //         }
    //     }
    //     System.out.println(max);
    //     System.out.println(min);
        
    // }

    // public static void main(String[] args) {
    //     int num[] = {1,2,3,4,56,6,88,54};
    //     Max_Min(num);
    // }












//     public static void Reverse(int arr[]){
//         int first = 0, last = arr.length-1;
//         while(first<last){
//             int temp = arr[last];
//             arr[last]= arr[first];
//             arr[first] = temp;
//             first++;
//             last--;
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5,6};
//         Reverse(arr);
//         for(int i =0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
}



