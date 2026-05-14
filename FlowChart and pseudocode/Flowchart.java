// max of three numbers 

import java.util.*;
public class Flowchart{
public static void main(String[]args){
   Scanner sc  = new Scanner(System.in);
   int a = sc.nextInt();
   int b = sc.nextInt();
   int c = sc.nextInt();
   if(a>b){
    if(a>c){
        System.out.println(a);
    }else{
        System.out.println(c);
    }
   }else{
    if(b>c){
        System.out.println(b);
    }else{
        System.out.println(c);
    }
   }
}
}


// // Sum of n natural numbers

// import java.util.*;
// public class Flowchart {
// public static void main(String[]args){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int sum = 0; 
//     for(int  i = 0 ; i <= n; i++){
//         sum += i;
//     }
//     System.out.println(sum);
// }
// }


