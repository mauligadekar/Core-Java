package ExceptionHandling.CheckedAndUnchecked1;

public class CheckedException_1 {
    public static void main(String[] args) {

        System.out.println("Hello Java");

// Apply the try-catch block to handle checked exception.
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
