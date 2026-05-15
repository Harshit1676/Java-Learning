import java.util.*;
public class StringMethods {
    public static void main(String[] args) {
        String s = "  Hello, World  ";
        System.out.println(s.length());
        String trimmed = s.trim();
        System.out.println(trimmed);
        System.out.println(trimmed.length());

        System.out.println(trimmed.charAt(0));
        System.out.println(trimmed.charAt(7));

        System.out.println(trimmed.substring(7));
        System.out.println(trimmed.substring(2,12));

        String a = "Java";
        String b = "java";
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));

        System.out.println("apple".compareTo("banana"));
        System.out.println("apple".compareTo("apple"));
        System.out.println("zebra".compareTo("ant"));

        System.out.println(trimmed.indexOf("o"));
        System.out.println(trimmed.lastIndexOf("o"));
        System.out.println(trimmed.indexOf("World"));
        System.out.println(trimmed.indexOf("xyz"));

        System.out.println(trimmed.replace('l','L'));
        System.out.println(trimmed.replace("World","Java"));

        System.out.println(trimmed.toUpperCase());
        System.out.println(trimmed.toLowerCase());

        System.out.println(trimmed.startsWith("Hello"));
        System.out.println(trimmed.endsWith("d"));

    }
}
