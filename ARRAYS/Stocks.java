// import java.util.*;
// public class Stocks {
//     public static int BuyAndSell(int prices[]){
//         int buyPrices = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for(int i = 0 ; i < prices.length; i++){

//             if(buyPrices < prices[i]){ // Profit
//             int Profit = prices[i] - buyPrices; // Today's Profit
//             maxProfit = Math.max(maxProfit, Profit);
//             }
//             else{
//             buyPrices = prices[i];
//             }

//         }
//         return maxProfit;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();

//         int[] prices = new int[size];
//         for(int i = 0 ; i  < size; i++){
//             prices[i] = sc.nextInt();
//         }
//         System.out.println(BuyAndSell(prices));
//     }
// }
