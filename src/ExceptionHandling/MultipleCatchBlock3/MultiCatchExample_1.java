package ExceptionHandling.MultipleCatchBlock3;

public class MultiCatchExample_1 {
    public static void main(String[] args) {

        try
        {
            // Creating an array of six integer elements.
            int arr[] = new int[6];
            arr[3] = 20/0; // Exception occurred.
            System.out.println("I am in try block");
        }
        catch(ArithmeticException ae)
        {
            System.out.println("A number cannot be divided by zero, Illegal operation in java");// 1
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Accessing array element outside of specified limit");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("I am out of try-catch block"); // 2
    }
}
// After executing the first matched catch block,
// JVM does not execute the rest catch blocks and the program control goes to out of catch blocks.