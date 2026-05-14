import java.util.*;

public class upper_Bounded_Wildcard {

    // Method using Upper Bounded Wildcard
    public static double sumAll(List<? extends Number> list) {

        double total = 0;

        for (Number n : list) {
            total += n.doubleValue();
        }

        return total;
    }

    public static void main(String[] args) {

        List<Integer> ints = Arrays.asList(1, 2, 3, 4);

        List<Double> doubles = Arrays.asList(1.1, 2.2, 3.3);

        List<Number> nums = Arrays.asList(10, 3.3, 5);

        System.out.println(sumAll(ints));

        System.out.println(sumAll(doubles));

        System.out.println(sumAll(nums));
    }
}