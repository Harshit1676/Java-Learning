public class Assignment {
    public static void main(String[] args) {

        int x = 10;

        x += 5;   // x = x + 5 = 15
        System.out.println("After +=: " + x);  // 15

        x -= 3;   // x = x - 3 = 12
        System.out.println("After -=: " + x);  // 12

        x *= 2;   // x = x * 2 = 24
        System.out.println("After *=: " + x);  // 24

        x /= 4;   // x = x / 4 = 6
        System.out.println("After /=: " + x);  // 6

        x %= 4;   // x = x % 4 = 2
        System.out.println("After %=: " + x);  // 2

        // Bitwise assignment:
        x &= 3;   // x = x & 3
        x |= 5;   // x = x | 5
        x <<= 1;  // x = x << 1
    }
}