import java.util.*;
public class Collections_Connection {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");

        String lang = list.get(0);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice",95);
        map.put("Bob",87);

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.err.println(entry.getKey()+"->"+entry.getValue());
        }

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(5);
        ts.add(2);
        ts.add(8);
        ts.add(1);
        System.out.println(ts);

        Deque<String> deque = new ArrayDeque<>();
        deque.push("first");
        deque.push("second");
        System.out.println(deque.pop());  //Second LIFO

        List<String>names = Arrays.asList("Charlie","Alice","Bob");
        names.sort(Comparator.naturalOrder());
        System.out.println(names);
        Comparator<String> byLength = (a,b)->a.length()-b.length();
        names.sort(byLength);
        System.out.println(names);

    }
}
