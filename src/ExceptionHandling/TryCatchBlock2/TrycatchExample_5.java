package ExceptionHandling.TryCatchBlock2;

public class TrycatchExample_5 {
    public static void main(String[] args) {

        System.out.println("111"); // 1
        try
        {
            System.out.println("222"); // 2
            int y = 1/0;
        }
        catch(ArithmeticException e)
        {
            try
            {
                System.out.println("Hello"); // 3
                int x = 20/0;
            }
            catch(NullPointerException np) //  Exception object not matched Abnormal termination
            {
                System.out.println("333");
            }
        }
        System.out.println("444"); //
    }
}

