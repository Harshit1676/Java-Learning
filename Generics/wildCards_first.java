import java.util.*;

public static void printList(List<?>list){
    for(Object item : list){
        System.out.print(item+" ");
    }
    System.out.println();
}

public class wildCards_first {
    public static void main(String[] args) {
        List<String>  strings  = Arrays.asList("A", "B", "C");
    List<Integer> integers = Arrays.asList(1, 2, 3);
    List<Double>  doubles  = Arrays.asList(1.1, 2.2, 3.3);

    printList(strings);   // A B C
    printList(integers);  // 1 2 3
    printList(doubles);   // 1.1 2.2 3.3

    // LIMITATION of <?> — you CANNOT add to a wildcard list:
    // list.add("X");  // COMPILE ERROR — unsafe! Type unknown.
    // list.add(null); // Only null is allowed (special case)
    }
}
