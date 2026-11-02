package ExceptionHandling.ThrowVSThrows5;

public class ThrowExample_1 {
    public static void main(String[] args) {

        // Declaring a try-catch block.
        try
        {
     // Creating an object of ArithmeticException class.

            ArithmeticException a = new ArithmeticException("Hello from throw"); // Line 7
            throw a; // Exception thrown explicitly. // Line 8

            // written also in one line like this:
            // throw new ArithmeticException("Hello from throw");
        }
        catch(ArithmeticException ae)
        {
            System.out.println("ArithmeticException caught: \n" +ae);
            System.out.println(ae.getMessage());
        }
    }
}
// The thrown exception object is caught by corresponding catch block and stored in ae.
// The ae.getMessage() displays a string message append along with the internally generated message.