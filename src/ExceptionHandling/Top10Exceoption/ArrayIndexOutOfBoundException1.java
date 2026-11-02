package ExceptionHandling.Top10Exceoption;

public class ArrayIndexOutOfBoundException1 {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30};


      try{
          // This line will throw ArrayIndexOutOfBoundsException
          // The only valid indices are 0, 1, and 2
          int invalidElement = numbers[3];
      }
      catch (ArrayIndexOutOfBoundsException ae) {

          System.out.println("Invalid Index : " + ae);
      }
    }
}
