import java.util.*;
public class StringBuilderDeep {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Hello");
        StringBuilder sb3 = new StringBuilder(50);

        sb.append("Hello");
        sb.append(", ");
        sb.append("World");
        sb.append("!");
        sb.append(42);
        sb.append(true);
        System.out.println(sb);

        StringBuilder chain = new StringBuilder();
        chain.append("Java").append(" is ").append("awesone").append("!");
        System.out.println(chain);

        StringBuilder sb4 = new StringBuilder("Hello World!");
        sb4.insert(5,",");
        System.out.println(sb4);

        // ── delete(start, end) ── Remove characters ───────────────
        StringBuilder sb5 = new StringBuilder("Hello, World!");
        sb5.delete(5, 7);  // Remove chars at index 5 and 6 (', ')
        System.out.println(sb5);  // "HelloWorld!"

        // ── deleteCharAt(index) ── Remove single character ─────────
        sb5.deleteCharAt(5);  // Remove 'W'
        System.out.println(sb5);  // "Helloorld!"

        // ── replace(start, end, str) ──────────────────────────────
        StringBuilder sb6 = new StringBuilder("Hello Java!");
        sb6.replace(6, 10, "World");  // Replace "Java" with "World"
        System.out.println(sb6);  // "Hello World!"

        // ── reverse() ─────────────────────────────────────────────
        StringBuilder sb7 = new StringBuilder("Hello");
        sb7.reverse();
        System.out.println(sb7);  // "olleH"

        // ── length() and charAt() ──────────────────────────────────
        StringBuilder sb8 = new StringBuilder("Java");
        System.out.println(sb8.length());    // 4
        System.out.println(sb8.charAt(1));   // 'a'

        // ── Convert to String ──────────────────────────────────────
        String result = sb8.toString();
        System.out.println(result);  // "Java"

        // ── Performance Demo ──────────────────────────────────────
        // Concatenate 10000 numbers — performance comparison
        long start1 = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 10000; i++) str += i;
        long end1 = System.currentTimeMillis();
        System.out.println("String + time: " + (end1 - start1) + "ms");

        long start2 = System.currentTimeMillis();
        StringBuilder sbPerf = new StringBuilder();
        for (int i = 0; i < 10000; i++) sbPerf.append(i);
        long end2 = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (end2 - start2) + "ms");
        // StringBuilder is DRAMATICALLY faster!
    }
}
