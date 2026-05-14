import java.util.*;
public class withoutGenerics {
    public static void main(String[] args) {

        // RAW ArrayList — no type parameter
        ArrayList students = new ArrayList();  // Warning: raw type!

        students.add("Alice");    // String — fine
        students.add(101);        // Integer — COMPILES! No protection
        students.add(3.14);       // Double — COMPILES! Chaos!

        // To get data back, you MUST cast manually:
        String name = (String) students.get(0);  // OK
        String oops = (String) students.get(1);  // ClassCastException at RUNTIME!
        // Program CRASHES when running — not when compiling
        // Bugs are INVISIBLE until the program runs
    }
}
