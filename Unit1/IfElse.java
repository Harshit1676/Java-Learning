

public class IfElse {
    public static void main(String[] args) {

        int age = 17;

        if (age >= 18) {
            System.out.println("You can vote.");
        } else {
            System.out.println("Too young to vote.");
            System.out.println("Come back in " + (18 - age) + " year(s).");
        }

        // Even/Odd
        int num = 7;
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }

        // Positive/Negative/Zero
        int n = -5;
        if (n > 0) {
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
} 
    

