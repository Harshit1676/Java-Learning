// import java.util.*;
// public class Patterns {
//     public static void HollowRectangle(int n, int m) {
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= m; j++){
//                 if(i == 1 || i == n || j == 1 || j == m){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         HollowRectangle(n, m);
//     }
// }



// import java.util.*;
// public class Patterns{
//     public static void InvertedHalfPyramid(int n){
//         for(int i = 1; i <= n; i++){
//             //SPACES
//             for(int j = 1; j <= n-i; j++){
//                 System.out.print(" ");
//             }
//             //STARS
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         InvertedHalfPyramid(n);
//     }
// }



// import java.util.*;
// public class Patterns {
//     public static void InvertedHalfPyramidNumbers(int n){
//         // int num = 1;
//         for(int i = 1; i <= n ;i++){
//             for(int j = 1 ; j <= n-i+1 ; j++){
//                 System.out.print(j);
//                 // num++;
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         InvertedHalfPyramidNumbers(n);
//     } 
// }



// import java.util.*;
// public class Patterns {
//     public static void FloydPattern(int n){
//         int num = 1;
//         for(int i = 0; i <= n; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print(num+" ");
//                 num++;
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         FloydPattern(n);
//     }
// }



// import java.util.*;
// public class Patterns {
//     public static void ZeroOneTriangle(int n) {
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= i; j++){
//                 if((i+j)%2==0){
//                     System.out.print("1");
//                 }else{
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         ZeroOneTriangle(n);
//     }
// }


// BUTTER FLY PATTERN 


// import java.util.*;
// public class Patterns{
//     public static void Butterfly(int n){
//         // 1st HALF
//         for(int i = 1; i <= n; i++){
//             for(int j = 1 ; j <= i; j++){
//                 // STARS
//                 System.out.print("*");
//             }
//             for(int j = 1; j <= 2*(n-i); j++){
//                 // SPACES
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         // 2st HALF
//         for(int i = n; i >= 1; i--){
//             for(int j = 1 ; j <= i; j++){
//                 // STARS
//                 System.out.print("*");
//             }
//             for(int j = 1; j <= 2*(n-i); j++){
//                 // SPACES
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         Butterfly(n);
//     }
// }



// SOLID RHOMBUS PATTERN

// import java.util.*;
// public class Patterns{
//     public static void SolidRhombus(int n){
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= (n-i); j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= n; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         SolidRhombus(n);
//     }
// }


// Hollow Rhombus Pattern 

// import java.util.*;
// public class Patterns{
//     public static void HollowRhombus(int n){
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= (n-i); j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= n; j++){
//                 if(i == 1 || i == n || j == 1 || j == n){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         HollowRhombus(n);
//     }
// }


// DIAMOND PATTERN


// import java.util.*;
// public class Patterns {
//     public static void DiamondPattern(int n) {
//         // 1st HALF
//         for(int i = 1; i <= n; i++){
//             //SPACES
//             for(int j = 1; j <= (n-i); j++){
//                 System.out.print(" ");
//             }
//             // Stars
//             for(int j = 1; j <= (2*i)-1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         // 2nd Half
//         for(int i = n; i >= 1; i--){
//             for(int j = 1; j <= (n-i); j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= (2*i)-1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         DiamondPattern(n);
//     }
// }




