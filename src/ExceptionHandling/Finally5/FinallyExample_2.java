package ExceptionHandling.Finally5;

public class FinallyExample_2 {
    public static void main(String[] args) {

        int a = 20, b = 0;
        try
        {
            System.out.println("Value of a: " +a); // 1
            System.out.println("Value of b: " +b); // 2
            int div = a/b;
            System.out.println("Division: " +div);
        }
        catch(ArithmeticException ae)
        {
            System.out.println(ae); // prints corresponding exception.
        }

        finally
        {
            System.out.println("Denominator cannot be zero"); // 3
        }
        System.out.println("Hello Java"); // 4
    }
}
// If exception is occired in the try and it handled by catch then finally block will ececute and outside finally code also