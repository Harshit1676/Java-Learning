import java.util.*;
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
    @Override
    public String toString(){
        return "(" + key + "->" + value + ")";
    }
}

public class Multiple_type_parameter {
    public static void main(String[] args) {
        Pair<String,Integer> studentMark = new Pair<>("Alice",95);
        System.out.println(studentMark);
        System.out.println(studentMark.getKey());
        System.out.println(studentMark.getValue());

        Pair<Integer,String> idName = new Pair<>(101,"Bob");
        System.out.println(idName);

        Pair<String,String> cityCountry = new Pair<>("Delhi", "India");
        System.out.println(cityCountry);
    }
}
 