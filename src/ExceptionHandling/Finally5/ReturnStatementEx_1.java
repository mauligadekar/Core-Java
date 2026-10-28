package ExceptionHandling.Finally5;

public class ReturnStatementEx_1 {
    public static void main(String[] args) {

        try {

            System.out.println("Try");
            return;
        } catch (Exception e) {

            System.out.println("catch");
        } finally {

            System.out.println("Finally");
        }
    }
}

//Try
//Finally get more prority that return
