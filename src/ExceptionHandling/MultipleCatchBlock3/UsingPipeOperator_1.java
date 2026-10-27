package ExceptionHandling.MultipleCatchBlock3;

public class UsingPipeOperator_1 {
    public static void main(String[] args) {

        try {
            // Code that may throw different exceptions
            int result = Integer.parseInt("abc");
            int val = 10 / 0;
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
