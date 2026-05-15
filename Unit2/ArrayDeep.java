public class ArrayDeep {
    public static void main(String[] args) {

        // ── Method 1: Declare then Initialize ──────────────────────
        int[] marks;             // Declaration: reference variable (in stack)
        marks = new int[5];      // Creation: actual array in HEAP (5 ints, default 0)
        marks[0] = 85;           // Assignment: set each element
        marks[1] = 92;
        marks[2] = 78;
        marks[3] = 95;
        marks[4] = 67;

        // ── Method 2: Declare + Create + Initialize ─────────────────
        int[] scores = {85, 92, 78, 95, 67};
        // Java counts elements (5) and creates array automatically

        // ── Method 3: new with values ───────────────────────────────
        String[] names = new String[]{"Alice", "Bob", "Charlie"};

        // ── Accessing Elements ───────────────────────────────────────
        System.out.println(scores[0]);  // 85 (first)
        System.out.println(scores[4]);  // 67 (last)
        // scores[5] → ArrayIndexOutOfBoundsException! Index 5 doesn't exist.

        // ── Array Length ──────────────────────────────────────────────
        System.out.println(scores.length);  // 5 (property, NOT method — no ())

        // ── Traversal with for loop ───────────────────────────────────
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            System.out.print(scores[i] + " ");
        }
        System.out.println("\nSum: " + sum);
        System.out.println("Avg: " + (double)sum / scores.length);

        // ── Find Max ──────────────────────────────────────────────────
        int max = scores[0];  // Assume first is max
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];  // Update if found larger
            }
        }
        System.out.println("Max: " + max);  // 95

        // ── Array copy ────────────────────────────────────────────────
        int[] copy = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
            copy[i] = scores[i];
        }
        // OR: int[] copy = scores.clone();
        // OR: System.arraycopy(scores, 0, copy, 0, scores.length);
        // int[] scores = {34,5,3,2,1};
        // int[] copy = scores.clone();
        // for(int i:copy){
        //     System.out.print(i+" ");
        // }

    }
}