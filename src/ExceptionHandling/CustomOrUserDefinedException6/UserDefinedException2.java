package ExceptionHandling.CustomOrUserDefinedException6;
import java.util.Scanner;

class InvalidAgeException extends Exception{

    InvalidAgeException(String str){
        super(str);
    }
}

public class UserDefinedException2 {
    private static int age;

        static  void validate() throws InvalidAgeException{

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        age = sc.nextInt();

        if (age < 18){
            throw new InvalidAgeException("You are not Eligible for Vote");
        }

        else
            System.out.println("Welocme to vote");
    }
    public static void main(String[] args) {

        try {
            validate();
        }
        catch (Exception ae){
            System.out.println("caugth Exception : \n" + ae);
        }
    }
}
