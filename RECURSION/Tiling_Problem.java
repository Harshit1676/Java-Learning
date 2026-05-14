// public class Tiling_Problem {
//     public static int tilingProblem(int n){//2 x n (floor size)

//         if(n==0 || n==1){
//             return 1;
//         }
//         // Vertical choice
//         int fnm1 = tilingProblem(n-1);

//         // Horizontal choice
//         int fnm2 = tilingProblem(n-2);
        
//         // total ways
//         int tot_ways = fnm1+fnm2;
//         return tot_ways;

//     }

//      public static void main(String[] args) {
//          int n = 5;
//          System.out.println(tilingProblem(n));
//      }
// }
