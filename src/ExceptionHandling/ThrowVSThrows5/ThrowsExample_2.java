package ExceptionHandling.ThrowVSThrows5;

public class ThrowsExample_2 {
    public static void main(String[] args) throws InterruptedException
        {
            m1(); // main() method calling m1().
        }
        public static void m1() throws InterruptedException
        {
            m2(); // m1() method calling m2().
        }
        public static void m2() throws InterruptedException
        {
            m3(); // m2() method calling m3().
        }
        public static void m3() throws InterruptedException
        {
            Thread.sleep(100); // unreported exception java.lang.InterruptedException;
        }
}

// we got the the exceptio nat thread.sleep
// new m3() delegate the responsibility to the caller who is caller of m3() => m2() we got error at m2()
//m2 must habdle the exception
// m2() delegate the repso to the caller who is caller of m2() => m1() got exceptiona at m1()
// m1() must handle exception
// m1() delegate the respo to caller who is caller of m1() => main mehtod
// main must handle this exception .
