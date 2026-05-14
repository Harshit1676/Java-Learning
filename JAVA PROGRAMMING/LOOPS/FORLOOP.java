// import java.util.*;
// public class FORLOOP {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i = 1 ; i <= n ; i++){
//             System.out.println(i + "-" + "Hello Harshit");
//         }
//     }
// }


// import java.util.*;
// public class FORLOOP {
// public static void main(String[]args){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     for(int i = 1; i <= n ; i++){
//         for(int j =1; j <= n ; j++ ){
//             System.out.print("*");
//         }
//         System.out.println();
//     }  
// }
// }


// same pattern as upper

// public class FORLOOP{
// public static void main(String[]args){
//     int n = 4;
//     for(int i = 1; i <= n ; i++){
//         System.out.println("****");
//     }
// }
// }



// Reverse Number

// import java.util.*;
// public class FORLOOP {
// public static void main(String[]args){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int reverse = 0;
//     for(; n != 0; n /= 10){
//         int digit = n % 10;
//         reverse = reverse * 10 + digit;
//     }
//     System.out.println("Reversed Number: "+reverse);
// }
// }


// import java.util.*;
// public class FORLOOP  {
// public static void main(String[]args){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     for(int i = 0; i <= n ; i++){
//         if(i == 3){
//             continue;
//         }
//         System.out.print(i+" ");
//     }
// }
// }


// import java.util.*;
// public class FORLOOP {
// public static void main(String[]args){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     for(int i = 1; i <= n; i++){
//         if(i == 4){
//             break;
//         }
//         System.out.println(i);
//     }
//     System.out.println("I am out of the loop");
// }
// }



// CHECK PRIME OR NOT


// import java.util.*;
// public class FORLOOP {
// public static void main(String[]args){
//     Scanner sc = new Scanner(System.in);
//     int  n = sc.nextInt();
//     boolean isPrime = true;
//     for(int i = 2; i <= n; i++){
//         if(n % i == 0){
//             isPrime = false;
//         }
//     }
//     if(isPrime == true){
//         System.out.println("n is a prime number");
//     }else{
//         System.out.println("n is not a prime number");
//     }
// }
// }


