import java.util.*;
class MathUtil {
    public static<T extends Number> double sum(T a, T b){
        return a.doubleValue() + b.doubleValue();
    }
    public static<T extends Comparable<T>> T max(T a, T b){
        return (a.compareTo(b) >= 0) ? a : b;
    }
}
public class Bounded_Generic_Method {
    public static void main(String[] args){
        System.out.println(MathUtil.sum(5,4));
        System.out.println(MathUtil.sum(5.3,4.5));
        System.out.println(MathUtil.sum(5,4.5));

        System.out.println(MathUtil.max(10,20));
        System.out.println(MathUtil.max("Apple", "Mango"));
        System.out.println(MathUtil.max(3.14,2.37));

    }
}
