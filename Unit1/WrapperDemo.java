import java.util.*;
public class WrapperDemo {
    public static void main(String[] args) {

        // ── Boxing (primitive → wrapper object) ───────────────────
        int primitive = 42;
        Integer wrapped = Integer.valueOf(42);
        System.out.println("Max int: "+Integer.MAX_VALUE);
        System.out.println("Max int: "+Integer.MIN_VALUE);

        // ── Unboxing (wrapper → primitive) ────────────────────────
        Integer obj = new Integer(100);
        int val  = obj.intValue();
        System.out.println("Unboxed: "+val);

        

    }    
}
