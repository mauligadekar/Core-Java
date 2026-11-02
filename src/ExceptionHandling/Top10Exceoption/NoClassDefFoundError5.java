package ExceptionHandling.Top10Exceoption;

class Hello {

    public void display() {
        System.out.println("Hello Java");
    }
}
public class NoClassDefFoundError5 {
    public static void main(String[] args) {

        Hello obj = new Hello();

        obj.display();

    }
}
// Step 1: Compile both files
//This generates:
//Hello.class => Now delete Hello.class from your folder.
//Test.class

// NoClassDefFoundError