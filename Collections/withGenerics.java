import java.util.*;
public class withGenerics {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Harshit");
        list.add("Om");

        String name = list.get(0);
        System.out.println(name.toUpperCase());

        for(String n: list){
            System.out.println(n);
        }
    }
}
