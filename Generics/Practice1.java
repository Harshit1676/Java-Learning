import java.util.*;
class Box<T>{
    private T value;

    public Box(T value){
        this.value = value;
    }
    public void set(T value){
        this.value = value;
    }
    public T get(){
        return value;
    }
    public void display(){
        System.out.println("Value: "+value);
        System.out.println("Type: "+value.getClass().getName());
    }
}
public class Practice1 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hello Java");
        stringBox.display();
        String str = stringBox.get();
        System.out.println("upperCase: "+str.toUpperCase());

        Box<Integer> intBox = new Box<>(100);
        intBox.display();
        Integer num = intBox.get();
        System.out.println("Double value: "+(num*2));

        Box<Boolean> boolBox = new Box<>(true);
        boolBox.display();
        Boolean flag = boolBox.get();

        System.out.print("Boolean Value: "+ flag);
        stringBox.set("Updated Value");
        System.out.println("After set():");
        stringBox.display();
    }
}
