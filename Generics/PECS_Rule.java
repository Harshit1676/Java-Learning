import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PECS_Rule {
    // PRODUCER (you READ from source): use extends
public static <T> void copy(List<? extends T> source,   // Producer
                             List<? super T>   dest) {   // Consumer
    for (T item : source) {  // Reading from source (extends)
        dest.add(item);      // Writing to dest (super)
    }
}

public static void main(String[] args) {
    List<Integer> source = Arrays.asList(1, 2, 3, 4, 5);
    List<Number>  dest   = new ArrayList<>();

    copy(source, dest);  // Copy integers into number list
    System.out.println(dest);  // [1, 2, 3, 4, 5]
}
}
