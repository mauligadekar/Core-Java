package ExceptionHandling.Finally5;

public class FinallyExample_5 {
    public static void main(String[] args) {

        try
        {
            System.out.println("111"); // 1
            System.out.println(20/0);
            System.out.println("222");
        }
        catch(Exception ae)
        {
            System.out.println(10/0);
        }
        finally
        {
            System.out.println("444"); // 2
        }
        System.out.println("555");
    }
}

// arithmetic exception has occurred inside try block.
// The control will be passed to the catch block but an exception also occurred inside catch.
//So, the program will terminate abnormally by the default exception handler.
// But before termination of the program, JVM will go to execute only finally block.