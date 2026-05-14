// package Class_Java.Unit_3;

// abstract class animal {
//     // abstract void sound();
//     // void eat(){
//     //     System.out.println("Animals eats...");
//     // }
//     animal(){


//         System.out.println("Animals eats...");
//     }
// }
// class dog extends animal {
//     // void sound(){
//     //     System.out.println("Dog barks...");
//     // }
//     dog(){
//         System.out.println("dog barks...");
//     }
// }
// public class abstract_class {
//     public static void main(String[] args) {
//         // animal a  = new dog();
//         // // a.eat();
//         // // a.sound();
//     }
// }



abstract class Payment {
    abstract void pay();
    void process() {
        System.out.println("Processing payment...");
        pay();
        System.out.println("Payment done...");
    }
}

class upi extends Payment {
    void pay(){
        System.out.println("Paid using UPI..");
    }
}

public class abstract_class {
    public static void main(String[] args) {
        Payment p = new upi();
        p.process();
    }
}