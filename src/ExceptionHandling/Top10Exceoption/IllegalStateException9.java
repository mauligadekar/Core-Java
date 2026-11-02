package ExceptionHandling.Top10Exceoption;

public class IllegalStateException9 {
    public static void main(String[] args) {

        Thread t = new Thread();

        t.start(); // code copiled

        t.start(); // IllegalThreadStateException
        // once thread started we are not allowed to restart the same thread again

    }
}
