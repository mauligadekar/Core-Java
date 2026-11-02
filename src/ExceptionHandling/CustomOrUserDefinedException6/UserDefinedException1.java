package ExceptionHandling.CustomOrUserDefinedException6;

class OwnException extends Exception
{
    // Declare default constructor.
//    OwnException()
//    {
//
//    }

    // Declare a parameterized constructor with a parameter str of type string.
    OwnException(String str)
    {
        super(str); // Call super exception class constructor.
    }
}
public class UserDefinedException1 {
    public static void main(String[] args) {

        try
        {
            // Create an object of user defined exception and throw it using throw clause.
            OwnException obj = new OwnException("Created our own Exception");
            throw obj;
        }
        catch (OwnException ex)
        {
            System.out.println("Caught a user defined exception");
            System.out.println(ex.getMessage());
        }
    }
}

//OwnException is a Checked Exception.
//That means Java compiler forces you to handle it using either:
//- try-catch, or
//- throws declaration.

// if we use RuntimeException insted Exception
// Now OwnException becomes an Unchecked Exception.
//The important difference is that Java compiler does not force you to handle it.
//  throw new OwnException("Creating user defined exception");