public class Arithmetic {
    public static void main(String[] args) {
        int a = 17, b = 5;

        System.out.println(a + b);  // 22  (addition)
        System.out.println(a - b);  // 12  (subtraction)
        System.out.println(a * b);  // 85  (multiplication)
        System.out.println(a / b);  // 3   (INTEGER division — quotient only!)
        System.out.println(a % b);  // 2   (modulus — REMAINDER)

        // INTEGER DIVISION — common beginner mistake!
        System.out.println(7 / 2);       // 3 (NOT 3.5! Both are int)
        System.out.println(7.0 / 2);     // 3.5 (7.0 is double)
        System.out.println((double)7/2); // 3.5 (cast one to double)

        // MODULUS use cases:
        System.out.println(10 % 2); // 0 → even (divisible)
        System.out.println(11 % 2); // 1 → odd
        System.out.println(17 % 3); // 2 → remainder when dividing by 3
        System.out.println(7 % 10); // 7 → last digit extraction!

        // String concatenation with +:
        System.out.println("Sum = " + (a + b)); // "Sum = 22"
        System.out.println("Sum = " + a + b);   // "Sum = 175" ← TRAP!
        // Evaluation: ("Sum = " + a) = "Sum = 17", then + b = "Sum = 175"
        // Always use parentheses with arithmetic in string concat!
    }
}