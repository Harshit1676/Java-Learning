import java.util.*;

// Goals of Generics:

// Type Safety — Catch errors at compile time, not runtime
// No Casting — Compiler knows the type, handles it automatically
// Reusability — One class works for String, Integer, Double, anything
// Cleaner code — No ugly (String) casts everywhere


// T  → Type (general purpose)
// E  → Element (used in Collections like ArrayList<E>)
// K  → Key (used in HashMap<K, V>)
// V  → Value (used in HashMap<K, V>)
// N  → Number
// R  → Return type


class Box<T> {
    private T value;

    public Box(T value){
        this.value = value;
    }
    public void setValue(T value){
        this.value = value;
    }
    public T getValue(){
        return value;
    }
    public void display() {
        System.out.println("Box Contains : "+value);
        System.out.println("Type: "+value.getClass().getName());
    }
}

public class GenericFirst {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hello Box");
        stringBox.display();
        String s = stringBox.getValue();
        System.out.println(s.toUpperCase());

        Box<Integer> intBox = new Box<>(100);
        intBox.display();
        int num = intBox.getValue();
        System.out.println(num*2);

        Box<Double> doubleBox = new Box<>(3.14);
        doubleBox.display();
    }
}
