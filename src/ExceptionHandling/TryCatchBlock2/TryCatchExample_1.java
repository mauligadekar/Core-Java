package ExceptionHandling.TryCatchBlock2;

public class TryCatchExample_1 {
    public static void main(String[] args) {

        System.out.println("11"); // 1
        System.out.println("Before divide"); // 2

// Applying try-catch block to handle exception.
        try
        {
            int x = 1/0;
            System.out.println("After divide");
        }
        catch(ArithmeticException ae) // Here, ae is a reference variable of exception object.
        {
            System.out.println("A number cannot be divided by zero"); // 3
        }
        System.out.println("22"); // 4
    }
}
