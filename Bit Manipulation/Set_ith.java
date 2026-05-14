public class Set_ith {
    public static int Set_ith_Bit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }
    public static void main(String[] args) {
        System.out.println(Set_ith_Bit(10,2));
    }
}
