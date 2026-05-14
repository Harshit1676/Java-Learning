// import java.util.*;
// class Animal {
//     void eat(){
//         System.out.println("Animals eats");
//     }
// }
// class dog extends Animal {
//     void bark(){
//         System.out.println("Dogs barks");
//     }
// }

class Animal {
    void eat(){
        System.out.println("Animals are eating");
    }
}
class dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
}
class puppy extends dog {
    void weep(){
        System.out.println("weeping");
    }
}
public class Main {
    public static void main(String[] args) {
        // dog d = new dog();
        // d.eat();
        // d.bark();
        puppy p = new puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}
