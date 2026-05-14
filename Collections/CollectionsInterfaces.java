import java.util.*;


public class CollectionsInterfaces {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Arsh");
        list.add("Yash");
        list.add("Harshhit");
        System.out.println(list);
        System.out.println(list.get(1));

        Set<Integer> st = new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(2);
        st.add(1);
        System.out.println(st);
       
        Map<String,Integer> mp = new HashMap<>();
        mp.put("Alice",90);
        mp.put("Bob",95);
        mp.put("Charlie",87);
        System.out.println(mp);
        System.out.println(mp.get("Alice"));

        // FIFO first in first out
        Queue<String> queue = new LinkedList<>();
        queue.offer("Task1");
        queue.offer("Task2");
        queue.offer("Task3");
        System.out.println(queue.poll());

        // Deque-Double ended both sides 
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(10);
        deque.addLast(20);
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());

    }
}
