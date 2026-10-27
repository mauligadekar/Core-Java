package ExceptionHandling.TryCatchBlock2;

public class TrycatchExample_4 {
    public static void main(String[] args) {

        try
        {
            System.out.println("111"); // 1
            System.out.println("222"); // 2
        }
        catch(ArithmeticException ae)
        {
            System.out.println("333");
        }
        System.out.println("444"); // 3
    }
}
