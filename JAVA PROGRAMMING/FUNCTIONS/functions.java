// import java.util.*;
// public class functions {
//     public static int Multiply(int a, int b) {
//         int product = a * b;
//         return product;

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int prod = Multiply(a, b);
//         System.out.println("Product is: "+prod);
//     }
// }




// Factorial of a NUMBER

// import java.util.*;
// public class functions {
//     public static int factorial(int n) {
//         int fact = 1;
//         if(n<0){
//             System.out.println("Factorial is not defined for negative numbers");
//         }else{
//             for(int i = 1; i <= n; i++){
//                 fact = fact * i;
//             } 
//         }
//         return fact;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(factorial(n));
//     }
// }


// Binomial coeffiecient


// import java.util.*;
// public class functions {
//     public static int factorial(int n) {
//         int fact = 1;
//         if(n<0){
//             System.out.println("Factorial is not defined for negative numbers");
//         }else{
//             for(int i = 1; i <= n; i++){
//                 fact = fact * i;
//             } 
//         }
//         return fact;
//     }
//     public static int binCoefficient(int n, int r){
//         int fact_n = factorial(n);
//         int fact_r = factorial(r);
//         int fact_nmr = factorial(n-r);
//         int bincoeff = fact_n / (fact_r * fact_nmr);
//         return bincoeff;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int r = sc.nextInt();
//         System.out.println(binCoefficient(n, r));
//     }
// }



// public class functions {
//     public static int sum(int a, int b) {
//         return a+b;
//     }
//     public static int sum(int a, int b, int c) {
//         return a+b+c;
//     }
// public static void main(String[]args){
//     System.out.println(sum(5,3));
//     System.out.println(sum(5,2,1));
// }
// }


// Check prime or not 


// import java.util.*;
// public class functions{
//     public static boolean isPrime(int n){
//         if(n == 2){
//             return true;
//         }
//         for(int i = 2; i <= Math.sqrt(n); i++){
//             if(n % i == 0){
//             return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(isPrime(n));
//     }
// }




// Primes in range

// import java.util.*;
// public class functions{
//     public static boolean isPrime(int n){
//         if(n == 2){
//             return true;
//         }
//         for(int i = 2; i <= Math.sqrt(n); i++){
//             if(n % i == 0){
//             return false;
//             }
//         }
//         return true;
//     }
//     public static void PrimesInRange(int n){
//         for(int i = 2; i <= n ; i++){
//             if(isPrime(i)){ // true
//                 System.out.println(i+" ");
//             }
//         }
//         System.out.println(); 
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(isPrime(n));
//         PrimesInRange(n);
//     }
// }



// Binary to decimal conversion

// import java.util.*;
// public class functions{
//     public static void BinToDecimal(int binNum){
//         int myNum = binNum;
//         int pow  = 0;
//         int decNum = 0;
//         while(binNum > 0){
//             int last_digit = binNum % 10;
//             decNum = decNum + (last_digit * (int)Math.pow(2, pow));
//             pow++;
//             binNum = binNum/10;
//         }
//         System.out.println("Decimal of "+ myNum + " = "+ decNum);
//     }
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int binNum = sc.nextInt();
//         BinToDecimal(binNum);
//     }
// }



// Decimal to Binary conversion

// import java.util.*;
// public class functions{
//     public static void DecimalToBinary(int decNum){
//         int myNum = decNum;
//         int pow = 0;
//         int binNum = 0;
//         while(decNum > 0){
//             int remainder = decNum % 2;
//             binNum = binNum + (remainder * (int)Math.pow(10,pow));
//             pow++;
//             decNum /= 2;
//         }
//         System.out.println("Binary of "+myNum+" = "+binNum);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int decNum = sc.nextInt();
//         DecimalToBinary(decNum);
//     }
// }



