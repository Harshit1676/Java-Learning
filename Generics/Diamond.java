// the diamond operator <> — an empty pair of angle brackets that tells the compiler:
// "I already told you the type on the left side. You figure out the right side."
// This is called Type Inference — the compiler infers (deduces) the type automatically.

import java.util.*;



public class Diamond {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Harshit");
        names.add("Yash");

        HashMap<String , Integer> scores = new HashMap<>();
        scores.put("Alice",95);

        LinkedList<Double> marks = new LinkedList<>();
        marks.add(9.5);
        marks.add(9.8);

        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(10);
        deque.push(20);

        // Nested generics — diamond makes this much cleaner
        // Old way:
        HashMap<String,ArrayList<Integer>> old = new HashMap<String, ArrayList<Integer>>();

        // New way with diamond:
        HashMap<String, ArrayList<Integer>> modern = new HashMap<>();

        System.out.println(names);
        System.out.println(scores);
        System.out.println(deque);
        System.out.println(marks);
    }
}
