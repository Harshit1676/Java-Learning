// // public class Abstraction {
// //     public static void main(String[] args) {
// //         Horse h = new Horse();
// //         h.eat();
// //         h.walk();

// //         Chicken c = new Chicken();
// //         c.eat();
// //         c.walk();
// //     }
// // }


// // abstract class Animal{
// //     void eat(){
// //         System.out.println("Animal eats");
// //     }

// //     abstract void walk(); 
// // }

// // class Horse extends Animal{
// //     void walk() {
// //         System.out.println("Walks on 4 leg");
// //     }
// // }

// // class Chicken extends Animal {
// //     void walk(){
// //         System.out.println("Walks on 2 legs");
// //     }
// // }




// // INTERFACES

// public class Abstraction {
//     public static void main(String[] args) {
//         Queen q = new Queen();
//         q.moves();

//         King k = new King();
//         k.moves();

//         Rook R = new Rook();
//         R.moves();
//     }
// }

// interface ChessPlayer{
//     void moves();
// }

// class Queen implements ChessPlayer {
//     public void moves(){
//         System.out.println("up, down, right, left,diagonally,(all four dignls)");
//     }
// }

// class Rook implements ChessPlayer {
//     public void moves(){
//         System.out.println("up,down,left,right (all straight)");
//     }
// }



// class King implements ChessPlayer {
//     public void moves(){
//         System.out.println("up,dowm,left,right,diagonally(single step only)");
//     }
// }