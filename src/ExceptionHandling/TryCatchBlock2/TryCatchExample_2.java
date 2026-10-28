package ExceptionHandling.TryCatchBlock2;

public class TryCatchExample_2 {
    public static void main(String[] args) {

        System.out.println("111"); // 1
        try
        {
            int x = 12/0; // exception occurred.
            System.out.println("Result of x: " +x);
            System.out.println("333");
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Hello world"); // 2
        }
        System.out.println("444"); // 3
    }
}
