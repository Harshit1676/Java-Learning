// Time Complexity O(n)

// import java.util.*;
// public class TappingRain {
//     public static int trappedRainWater(int height[]){
//         int n = height.length;
//         // calculate left max boundry - array
//         int[] leftmax = new int[n];
//         leftmax[0] = height[0];
//         for(int i = 1; i < n; i++){
//             leftmax[i] = Math.max(height[i], leftmax[i-1]);
//         }
//         // calculate right max boundry - array
//         int[] rightmax = new int[n];
//         rightmax[n-1] = height[n-1];
//         for(int i = n-2; i >= 0 ; i--){
//             rightmax[i] = Math.max(height[i], rightmax[i+1]);
//         }

//         //loop
//         int trapped = 0;
//         for(int i = 0; i < n ; i++){

//             //waterLevel = min(leftmax bound, rightmax bound)
//             int waterLevel = Math.min(leftmax[i], rightmax[i]);

//             // trapped water  = water level - height[i]
//             trapped += waterLevel - height[i];
//         }
//         return trapped;
        
//     }
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size: ");
//         int size = sc.nextInt();

//         System.out.println("Enter elements: ");
//         int[] height = new int[size];
//         for(int i = 0 ; i < size; i++){
//             height[i] = sc.nextInt();
//         }
//         System.out.println(trappedRainWater(height));
//     }
// }
