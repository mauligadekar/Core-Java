package ExceptionHandling.ThrowVSThrows5;

public class ThrowsExample_1 {
    public static void main(String[] args) throws InterruptedException{

        Thread.sleep(1000);
        System.out.println("Hello Java");
    }
}

// main method delegate the exception handling responsibility to the caller
// JVM is a caller of Main method.