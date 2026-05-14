public class String_builder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Basics");
        sb1.append(true);
        sb1.append(45.332);
        sb1.append(" to advance");

        System.out.println(sb1);

        System.out.println(sb1.indexOf("t"));
        System.out.println(sb1.lastIndexOf("2"));

        sb1.delete(5,14);
        System.out.println(sb1);
        
    }
}
