package ExceptionHandling.Finally5;

public class FinallyNotExecute {
    public static void main(String[] args) {

        try {

            System.out.println("Try");
            System.exit(0);
        } catch (Exception e) {

            System.out.println("catch");
        } finally {

            System.out.println("Finally");
        }
    }
}
// Try