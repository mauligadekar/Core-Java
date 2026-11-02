
package ExceptionHandling.ThrowVSThrows5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsExample_3 {

    private String firstName;
    private String lastName;

    void accept() throws IOException {

        InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(sr);

        System.out.println("Enter your first name:");
        firstName = br.readLine();

        System.out.println("Enter your last name:");
        lastName = br.readLine();
    }

    void display() {
        System.out.println("Full Name: " + firstName + " " + lastName);
    }

    public static void main(String[] args) throws IOException {

        ThrowsExample_3 obj = new ThrowsExample_3();

        obj.accept();
        obj.display();
    }
}
