package ExceptionHandling.ThrowVSThrows5;

public class ThrowExample_2 {
    public static void main(String[] args) {

        int x = 20;
        int y = 0;
        try
        {
            int z = x/y; // Exception occurred. // Line 9
            System.out.println("Result: " +z); // Line 10
            throw new ArithmeticException();
        }
        catch(ArithmeticException ae) {
            System.out.println("Exception caught: \n" +ae); // 1
        }
    }
}

//when an exception occurred, the rest of code (line 10) did not execute and
// the program control immediately transferred to catch block to handle the exception.