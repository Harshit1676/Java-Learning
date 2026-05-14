import java.util.*;

class MultiBound<T extends Number & Comparable<T>>{
    private T value;

    public MultiBound(T value){
        this.value = value;
    }
    public boolean isGreaterThan(T other){
        return value.compareTo(other)>0;
    }

    public double doubled() {
        return value.doubleValue()*2;
    }
}

public class Multiple_Bound {
    public static void main(String[] args){
        MultiBound<Integer> mb = new MultiBound<>(10);
        System.out.println(mb.isGreaterThan(5));
        System.out.println(mb.doubled());
    }
}
