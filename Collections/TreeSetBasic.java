import java.util.*;
public class TreeSetBasic {
    public static void main(String[] args){
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(98);
        scores.add(88);
        scores.add(95);
        scores.add(98);
        scores.add(90);
        scores.add(85);

        System.out.println(scores);
        System.out.println(scores.first());
        System.out.println(scores.last());

        System.out.println(scores.headSet(87));
        System.out.println(scores.tailSet(93));

        TreeSet<Integer> reversed = new TreeSet<>(Comparator.reverseOrder());
        reversed.addAll(scores);
        System.out.println(reversed);
    }
}


// When you add an element to TreeSet:
//   TreeSet calls compareTo() to:
//   1. Find where to place the element in the tree
//   2. Check if duplicate (compareTo() == 0 → duplicate, rejected)

// compareTo() return value meaning:
// ┌──────────────┬────────────────────────────────────────────────┐
// │ Return Value │ Meaning                                        │
// ├──────────────┼────────────────────────────────────────────────┤
// │ Negative (<0)│ this < other → goes LEFT in tree              │
// │ Zero (0)     │ this == other → DUPLICATE, element rejected   │
// │ Positive (>0)│ this > other → goes RIGHT in tree             │
// └──────────────┴────────────────────────────────────────────────┘