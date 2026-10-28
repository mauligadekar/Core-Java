package ExceptionHandling.Finally5;

public class FinallyExample_6 {
    public static void main(String[] args) {

        try
        {
            System.out.println("111"); // 1
            System.out.println(20/0);
            System.out.println("222");
        }
        catch(ArithmeticException ae)
        {
            System.out.println("333"); // 2
        }
        finally
        {
            System.out.println(10/0); // Exception occurred in finally block. (AT)
        }
        System.out.println("555");
    }
}

// inside finally block, an exception occurred. So, JVM will terminate the program abnormally.