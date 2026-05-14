public class Relational {
    public static void main(String[] args) {
        int x = 10, y = 20;

        System.out.println(x > y);   // false
        System.out.println(x < y);   // true
        System.out.println(x >= 10); // true (10 >= 10 → true)
        System.out.println(x <= 9);  // false
        System.out.println(x == y);  // false (equality check)
        System.out.println(x != y);  // true  (not equal)

        // CRITICAL: == for primitives vs objects!
        int a = 5, b = 5;
        System.out.println(a == b);   // true (value comparison — primitives)

        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2);       // false (different objects in heap!)
        System.out.println(s1.equals(s2));  // true  (content comparison)
        // == for objects: checks if they point to SAME memory address
        // equals(): checks if content is same
    }
}