package ExceptionHandling.Finally5;

public class FinallyExample_4 {
    public static void main(String[] args) {

        try
        {
            System.out.println("111"); // 1
            System.out.println("222"); // 2
        }
        catch(Exception ae)
        {
            System.out.println(10/0);
        }

        finally
        {
            System.out.println("444"); // 3
        }
        System.out.println("555"); // 4
    }
}
