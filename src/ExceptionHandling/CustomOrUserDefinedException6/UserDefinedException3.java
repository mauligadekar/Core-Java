package ExceptionHandling.CustomOrUserDefinedException6;

import java.util.Scanner;

class MyException extends Exception{

    public MyException(String str){
        super(str);
    }
}
public class UserDefinedException3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the number less than 100");
            int number = sc.nextInt();
            int square = number * number;

            if (number >= 100){
                throw new MyException("Please Enter the number less than 100");
            }
            else
                System.out.println("square of " + number + " is: " + square);
        }
        catch (MyException e){

            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
        catch (Exception ae){

            System.out.println("An error occurred: " + ae.getMessage());
        }

        finally{
            sc.close();
        }
    }
}
