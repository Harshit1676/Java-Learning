import java.util.*;

class Box<T> {
    private T value;
    public Box(T value){
        this.value = value;
    }
    public T getvalue(){
        return value;
    }
    public void display(){
        System.out.println("Box Contains: "+value);
    }
}

public class Diamond_Custom_Generic {
    public static void main(String[] args){
        // Old way (Java 5/6)
        Box<String> b1 = new Box<String>("Hello");

        // New way with Diamond(Java 7+)
        Box<String> b2 = new Box<>("Vanshika");
        Box<Integer> b3 = new Box<>(45);
        Box<Double> b4 = new Box<>(8.51);
        
        b1.display();
        b2.display();
        b3.display();
        b4.display();
    }
}
