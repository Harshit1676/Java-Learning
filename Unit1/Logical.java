public class Logical {
    public static void main(String[] args) {
        int age = 20; boolean hasID = true;

        // && (AND): BOTH must be true
        System.out.println(age >= 18 && hasID);  // true && true = true
        System.out.println(age >= 18 && !hasID); // true && false = false

        // || (OR): AT LEAST ONE must be true
        System.out.println(age < 18 || hasID);   // false || true = true
        System.out.println(age < 18 || !hasID);  // false || false = false

        // ! (NOT): reverses boolean
        System.out.println(!true);   // false
        System.out.println(!false);  // true

        // ══ SHORT-CIRCUIT EVALUATION (VERY IMPORTANT) ════════════
        // && → if LEFT is false, RIGHT is NOT evaluated (already false)
        // || → if LEFT is true,  RIGHT is NOT evaluated (already true)

        int count = 0;

        // && short-circuit: false && ... → right side NOT evaluated!
        if (false && (++count > 0)) {
            System.out.println("Never reached");
        }
        System.out.println("count: " + count);  // 0 — ++count never ran!

        // || short-circuit: true || ... → right side NOT evaluated!
        if (true || (++count > 0)) {
            System.out.println("Short-circuited!");
        }
        System.out.println("count: " + count);  // Still 0!

        // PRACTICAL USE: Null check before method call
        String str = null;
        // if (str.length() > 0)           // NullPointerException!
        if (str != null && str.length() > 0) {  // SAFE! If null, second part skipped
            System.out.println("Not empty");
        } else {
            System.out.println("Null or empty");  // This prints
        }
    }
}