package ExceptionHandling.Finally5;

public class ReturnStatementEx_2 {

    int m1() {
        try {
            System.out.println("I am in try block");// 1
            return 50; // 2
        } catch (Exception e) {
            System.out.println("I am in catch block");
        }
        return 20; // return statement at the end of a method.
        //System.out.println("Statement after return"); // Unreachable code.
    }

    public static void main(String[] args) {

        ReturnStatementEx_2 ft = new ReturnStatementEx_2();
        System.out.println(ft.m1());
    }
}
