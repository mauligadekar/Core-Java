package ExceptionHandling.Finally5;

public class FinallyExample_1 {
    public static void main(String[] args) {


                int a = 20, b = 30;
                try
                {
                    int sum = a + b;
                    System.out.println("Sum: " +sum);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }

                finally
                {
                    System.out.println("finally block must be executed");
                }
                System.out.println("Hello Java");
    }
}

// no exception has occurred inside try block. So,
// catch block will not be executed and the control will directly go to the finally block.