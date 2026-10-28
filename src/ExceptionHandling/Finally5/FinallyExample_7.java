package ExceptionHandling.Finally5;

public class FinallyExample_7 {
    public static void main(String[] args) {

        try
        {
            System.out.println("111"); // 1
            System.out.println(20/0);
            System.out.println("222");
        }
        catch(NullPointerException npe)
        {
            System.out.println("333");
        }
        finally
        {
            System.out.println(10/0); // Exception occurred in finally block.
        }
        System.out.println("555");
    }
}

//  the program will be terminated abnormally