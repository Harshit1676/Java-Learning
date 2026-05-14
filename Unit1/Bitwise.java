
public class Bitwise {
    public static void main(String[] args){
        int a=12;
        int b=10;

        System.out.println("a & b: "+(a&b));
        System.out.println("a|b : "+(a|b));

        System.out.println("a ^ b : "+(a^b));

        // Rule: ~n = -(n+1)
        // ~12 = ~0000 1100 = 1111 0011 = -13 (two's complement)
        System.out.println("~a: "+(~a));

        // ── << (Left Shift) — shift bits left, fill with 0 ────────
        // 12 << 1: 0000 1100 → 0001 1000 = 24
        // Each left shift = multiply by 2
        System.out.println("a >> 1: "+(a>>1));
        System.out.println("a >> 2: "+(a>>2));

        // PRACTICAL USE of bitwise:
        // Check if number is even/odd using &

        int num=7;
        System.out.println(num+" is "+(num%2==0?"even":"odd"));
        System.out.println(num + " is "+((num&1)==0?"even":"odd"));
        // (num & 1): last bit is 0 for even, 1 for odd — faster than %!
    }
}
