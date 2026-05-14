// class Animal {
//     Animal(){
//         System.out.println("eating");
//     }
// }
// class dog extends Animal{
//     dog(){
//         System.out.println("barking...");
//     }
// }
// public class constructor {
//     public static void main(String[] args) {
//         dog d = new dog();
//     }
// }

// class Animal {
//     Animal(String name){
//         System.out.println("Animal "+name);
//     }
// }
// class dog extends Animal{
//     dog(){
//         super("Tommy");
//         System.out.println("Dog Created");
//     }
// }
// public class constructor {
//     public static void main(String[] args) {
//         dog d = new dog();
//     }
// }


// class animal{
//     void sound(){
//         System.out.println("animals makes sound");
//     }
// }
// class dog extends animal {
//     // @Override
//     void sound(){
//         System.out.println("dog barks ");
//     }
// }
// public class constructor{
//     public static void main(String[] args) {
//         // dog d = new dog();
//         // d.sound();
//         animal a = new dog(); //upcasting    (reference type animal object type dog)
//         a.sound();
//     }
// }


class animal {
    String name = "Animal";
}
class dog extends animal {
    String name = "Dog";
    void print(){
        System.out.println(super.name);
    }
}
public class constructor {
    public static void main(String[] args) {
        dog d = new dog();
        d.print();
        
    }
}