// You're building a phonebook. Given a name, find the phone number instantly.

// Linear search through a list = O(n) — too slow for millions of contacts.
// You need O(1) average lookup.

// HashMap = the phonebook of Java programming.
import java.util.*;

public class HashMapDeep {
    public static void main(String[] args){
        HashMap<String,Integer> marks = new HashMap<>();
        marks.put("Alice",90);
        marks.put("Bob",75);
        marks.put("Charlie",85);
        marks.put("Alice",90);// Key "Alice" exists → OVERWRITE value
        // HashMap allows ONE value per key — new value replaces old

        System.out.println(marks);
        int score = marks.get("Bob");
        System.out.println("Bob"+score);

        int x = marks.getOrDefault("Diana",0);
        System.out.println("Diana"+ x);

        System.out.println(marks.containsKey("Alice"));
        System.out.println(marks.containsKey("Alex"));

        System.out.println(marks.containsValue(75));
        System.out.println(marks.containsValue(77));

        marks.remove("Bob");
        System.out.println(marks);

        for(Map.Entry<String,Integer> entry : marks.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
        for(String key:marks.keySet()){
            System.out.println(key+ " ");
        }
        System.out.println();
        for(int val:marks.values()){
            System.out.println(val+" ");
        }
        System.out.println();
    }
}
