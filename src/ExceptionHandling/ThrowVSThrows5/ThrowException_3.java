package ExceptionHandling.ThrowVSThrows5;

public class ThrowException_3 {
    public static void main(String[] args) {

        int x = 20;
        int y = 0;

        try
        {
            int z = x/y;
            throw new ArithmeticException();
           // System.out.println("Result: " +z); // Unreachable code.
        }
        catch(ArithmeticException ae) {
            System.out.println("Exception caught: \n" +ae);
        }
    }
}
// we have written a statement after throw statement, we got unreachable code.
