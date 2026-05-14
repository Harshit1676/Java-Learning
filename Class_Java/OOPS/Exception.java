public class Exception {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int result = a / b;   // This will cause exception
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Occurred");
        }

        // // without try and catch if we try to run our program it will through error and after that whatever the lines of code will not execute
        // System.out.println("Program continues...");

        finally {
            System.out.println("Always runs");
        }
    }

}