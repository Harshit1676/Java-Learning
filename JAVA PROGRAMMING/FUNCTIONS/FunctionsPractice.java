
public class FunctionsPractice {

    // public static void DiamondPattern(int n){
    //     for(int i=1;i<=n;i++){
    //         // Spaces

    //         for(int j=1;j<=(n-i);j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1 ; j<=(2*i)-1;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

    //     for(int i=n;i>=1;i--){
    //         // Spaces

    //         for(int j=1;j<=(n-i);j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1 ; j<=(2*i)-1;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String[] args) {
    //     DiamondPattern(5);
    // }

    // public static void HollowRhombus(int n){
    //     for(int i =1; i<=n;i++){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j =1 ; j<=n;j++){
    //             if(i==1||i==5||j==1||j==5){
    //                 System.out.print("*");
    //             }else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String[] args) {
    //     HollowRhombus(5);
    // }


    // solid Rhombus Pattern 
    // public static void SolidRhombus(int n){
    //     for(int i =1; i<=n;i++){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j =1 ; j<=n;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String[] args) {
    //     SolidRhombus(5);
    // }



    // BUTTERFLY

    // public static void Butterfly(int n){
    //     for(int i = 1; i <= n; i++){
            
    //         // Stars
    //         for(int j=1 ;j <= i; j++){
    //             System.out.print("*");
    //         }
            
    //         for(int j=1 ; j<=2*(n-i) ; j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

    //     // 2nd Half

    //     for(int i = n; i >= 1; i--){
            
    //         // Stars
    //         for(int j=1 ;j <= i; j++){
    //             System.out.print("*");
    //         }
            
    //         for(int j=1 ; j<=2*(n-i) ; j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String[] args) {
    //     Butterfly(5);
    // }
    

    


    // public static void ZeroOneTriangle(int n) {
    //     for(int i=0;i<=n;i++){
    //         for(int j = 1; j <= i;j++){
    //             if((i+j)%2 == 0){
    //                 System.out.print("1");
    //             }else{
    //                 System.out.print("0");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String[] args) {
    //     ZeroOneTriangle(5);
    // }



    // public static void InvertedHalfPryamidNumbers(int n){
    //     // int num = 1;
    //     for(int i = 1; i <= n; i++){
    //         for(int j = 1;j <= n-i+1;j++){
    //             System.out.print(j);
    //             // num++;
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String[] args) {
    //     InvertedHalfPryamidNumbers(5);
    // }




    // public static void InvertedHalfPyramid(int n){
    //     for(int i = 1; i <= n; i++){
    //         //spaces
    //         for(int j = 1; j <= n-i; j++){
    //             System.out.print(" ");
    //         }
    //         for(int j = 1; j <= i; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println(); 
    //     }
        
    // }

    // public static void main(String[] args) {
    //     InvertedHalfPyramid(5);
    // }


    // public static void HollowRectangle(int n){
    //     for(int i = 1; i <= n; i++){
    //         for(int j=1; j <= n; j++){
    //             if(i == 1 || i == 5|| j == 1 || j == 5){
    //                 System.out.print("* ");
    //             }else{
    //                 System.out.print("  ");
    //             }
    //         }
    //         System.out.println();
    //     }
    //     // System.out.println();
    // }
    // public static void main(String[] args) {
    //     HollowRectangle(5);
    // }



    // public static void DecToBin(int decNum) {
    //     int myNum = decNum;
    //     int pow = 0;
    //     int binNum = 0;
        
    //     while(decNum != 0){
    //         int remainder = decNum%2;
    //         binNum = binNum + (remainder * (int)Math.pow(10,pow));
    //         pow++;
    //         decNum /= 2;
    //     }
    //     System.out.println(binNum);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int decNum = sc.nextInt();
    //     DecToBin(decNum);
    // }




    // public static void BinToDec(int binNum){
    //     int myNum = binNum;
    //     int pow  = 0;
    //     int decNum = 0;
    //     while(binNum != 0){
    //         int last_digit = binNum % 10;
    //         decNum = decNum + (last_digit * (int)Math.pow(2,pow));
    //         pow++;
    //         binNum /= 10;
    //     }
    //     System.out.println(decNum);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int binNum = sc.nextInt();
    //     BinToDec(binNum);
    //  }


    // Factorial


//     public static int Factorial(int n){
//         int fact = 1;
//         if(n<=0){
//             System.out.println("Factorial is not defined for the negative numbers");
//         }else{
//             for(int i = 1; i <= n; i++){
//                 fact = fact*i;
//             }
//         }
//         return fact;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(Factorial(n));
//     }
}


