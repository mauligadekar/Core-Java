
package ExceptionHandling.ThrowVSThrows5;

import java.io.IOException;

public class ThrowsExample_4 {

    static void display() throws IOException {
        System.out.println("Hello Java");
        throw new IOException();
    }

    public static void main(String[] args) {

        try {
            ThrowsExample_4.display();
        } catch (IOException e) {
            System.out.println("Caught an exception: \n" + e);
        }
    }
}
