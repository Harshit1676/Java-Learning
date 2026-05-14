import java.util.*;
public class connection_collections {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");

        String first = names.get(0);

        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Alice",95);
        scores.put("Bob",87);

        Integer score = scores.get("Alice");
        
        System.out.println(names);
        System.out.println(scores);
    }
}




// // RAW TYPE — using generic class WITHOUT type parameter (old way, dangerous)
// ArrayList rawList = new ArrayList();   // Raw type — compiler warns!
// rawList.add("Hello");
// rawList.add(100);     // No error — anything goes in
// rawList.add(3.14);    // No error — dangerous!
// String s = (String) rawList.get(1);   // ClassCastException at RUNTIME!

// // GENERIC TYPE — with type parameter (correct modern way)
// ArrayList<String> safeList = new ArrayList<>();
// safeList.add("Hello");
// // safeList.add(100);  // COMPILE ERROR — caught immediately!
// String s2 = safeList.get(0);  // No cast — clean and safe