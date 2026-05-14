public class Unary {
    public static void main(String[] args) {

        int a = 5;

        // ── Pre-increment: ++a ────────────────────────────────────
        // INCREMENT FIRST, then USE the value
        int result1 = ++a;  // a becomes 6 FIRST, then assigned to result1
        System.out.println("a = " + a);        // 6
        System.out.println("result1 = " + result1); // 6

        // ── Post-increment: a++ ───────────────────────────────────
        // USE the value FIRST, then INCREMENT
        int b = 5;
        int result2 = b++;  // result2 gets 5 FIRST, then b becomes 6
        System.out.println("b = " + b);        // 6
        System.out.println("result2 = " + result2); // 5 ← original value!

        // MEMORY TRACE for b++:
        // Before: b = 5
        // result2 = b; → result2 = 5 (copy of b taken)
        // b = b + 1;   → b = 6 (b incremented after)
        // After:  b = 6, result2 = 5

        // ── TRICKY EXAMPLE ────────────────────────────────────────
        int x = 5;
        int y = ++x + x++;
        //        ↑      ↑
        //   x→6 first  use 6, then x→7
        // y = 6 + 6 = 12, x = 7
        System.out.println("x = " + x);  // 7
        System.out.println("y = " + y);  // 12

        // ── Unary minus ───────────────────────────────────────────
        int n = 10;
        System.out.println(-n);   // -10
        System.out.println(+n);   // 10 (unary plus, rarely used)

        // ── Logical NOT ───────────────────────────────────────────
        boolean flag = true;
        System.out.println(!flag);  // false
        System.out.println(!!flag); // true (double negation)
    }
}