package ExceptionHandling.TryCatchBlock2;

public class TryCatchExample_3 {

    int x = 30, y = 0;
    void divide() {
        System.out.println("I am in method"); // 2
        try {
            System.out.println("I am in try block"); // 3
            int z = x / y;
            System.out.println("Result of z: " + z);

        } catch (NullPointerException np) {
            System.out.println("I am in catch block");
        }
    }
    public static void main(String[] args) {

        TryCatchExample_3 obj = new TryCatchExample_3();
            System.out.println("I am in main method"); // 1
            obj.divide();
        }
}
