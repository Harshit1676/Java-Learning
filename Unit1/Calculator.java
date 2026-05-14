import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Scanner reads user input

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();  // Read double from keyboard

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);  // Read first character of input

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double result;

        switch (op) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero!");
                } else {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                }
                break;
            default:
                System.out.println("Unknown operator: " + op);
        }

        sc.close();  // Always close Scanner
    }
}