package ExceptionHandling.Finally5;

public class FinallyExample_3 {
    public static void main(String[] args) {

        int a = 20, b = 0;
        try
        {
            System.out.println("Value of a: " +a); // 1
            System.out.println("Value of b: " +b); // 2
            int div = a/b;
            System.out.println("Division: " +div);
        }
        catch(NullPointerException npe)
        {
            System.out.println(npe); // prints corresponding exception.
        }

        finally
        {
            System.out.println("Denominator cannot be zero"); // 3
        }
        System.out.println("Hello Java");
    }
}

// exception has occurred inside try but it has been not handled by catch block because
// the corresponding catch block is not matched
// JVM will hand over exception object to the default exception handler for abnormal termination
// before terminate it will execute finally but code or statement after finaly not execute