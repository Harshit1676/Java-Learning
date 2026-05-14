// package Class_Java.Unit_3;

// interface animal {
//     void sound();
// }
// class dog implements animal {
//     public void sound() {
//         System.out.println("Dog barks..");
//     }
// }
// public class interfaces {
//     public static void main(String[] args) {
//         animal a = new dog();
//         a.sound();
//     }
// }


// interface test {
//     int x = 10;
// }
// public class interfaces {
//     public static void main(String[] args) {
//         System.out.println(test.x);
//     }
// }


interface A {
    void show();
}
interface B {
    void display();
}
class C implements A,B {
    public void show(){
        System.out.println("Show");
    }
    public void display(){
        System.out.println("Display");
    }
}

public class interfaces {
    public static void main(String[] args) {
        C c = new C();
        c.show();
        c.display();
    }
}