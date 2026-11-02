package ExceptionHandling.Top10Exceoption;

public class AssertionError10 {
    public static void main(String[] args) {

        int age = 15;

        assert age >= 18 : "Age must be 18 or above";

        System.out.println("You are eligible.");
    }
}

// 2. Important: How to enable assertions?
//By default, Java assertions are disabled.
//You must enable them using -ea.
//java -ea AssertionExample10