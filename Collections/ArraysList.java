import java.util.*;
public class ArraysList {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("Cherry");
        System.out.println(list);

        list.add(0,"Avacado");
        System.out.println(list);

        String item = list.get(1);
        System.out.println("Index 2: "+item);;

        list.set(0,"Apricot");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.remove("Cherry");
        System.out.println(list);

        System.out.println(list.contains("Banana"));
        System.out.println(list.contains("Apricot"));

        System.out.println("Size: "+list.size());

        list.clear();
        System.out.println("After Clear: "+ list);
        System.out.println("Size: "+list.size());

        ArrayList<Integer> l = new ArrayList<>();
        l.add(7);
        l.add(9);
        l.add(4);
        l.add(6);
        l.add(5);

        Collections.sort(l);
        System.out.println(l);
    }
}
