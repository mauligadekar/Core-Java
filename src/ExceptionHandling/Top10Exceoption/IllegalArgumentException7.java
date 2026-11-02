package ExceptionHandling.Top10Exceoption;

public class IllegalArgumentException7 {
    public static void main(String[] args) {

        Thread t = new Thread();
        t.setPriority(10); // code compiled

      //  t.setPriority(100); // IllegalArgumentException


    }
}
