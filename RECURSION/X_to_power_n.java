// //Time Complexity is O(n)

// // public class X_to_power_n {
// //     public static int power(int x,int n){
// //         if(n == 0){
// //             return 1;
// //         }
// //         // int Xnm1 = power(x, n-1);
// //         // int Xn = x*Xnm1;
// //         // return Xn;
// //         return x*power(x,n-1);
// //     }
// //     public static void main(String[] args) {
// //         int x = 2;
// //         int n = 10;
        
// //         System.out.println(power(x, n));
// //     }
// // } 


// // Optimized way 

// // Time Complexity is O(log n)

// public class X_to_power_n{
//     public static int OptimizedPower(int x,int n){
//         if(n==0){
//             return 1;
//         }
//         int halfPower = OptimizedPower(x, n/2);
//         int haflPowerSq = halfPower * halfPower;
//         if(n%2 != 0){
//             haflPowerSq = x * haflPowerSq;
//         }
//         return haflPowerSq;
//     }
//     public static void main(String[] args) {
//         int x = 2;
//         int n = 10;
//         System.out.println(OptimizedPower(x, n));
//     }
// } 