import java.util.*;
public class lower_Bounded_wildcard {
    public static void addNumbers(List<? super Integer>list){
        list.add(1);
        list.add(2);
        list.add(3);
    }

    public static void main(String[] args){
        List<Integer> intList = new ArrayList<>();
        List<Number> numList = new ArrayList<>();
        List<Object> objList = new ArrayList<>();

        addNumbers(intList);
        addNumbers(numList);
        addNumbers(objList);

        System.out.println(intList);
        System.out.println(numList);
        System.out.println(objList);

        // Reading from List<? super Integer> gives Object (least common type):
        // Object o = list.get(0);  // Only Object type — not Integer
        // Integer i = list.get(0); // COMPILE ERROR
    }
}
