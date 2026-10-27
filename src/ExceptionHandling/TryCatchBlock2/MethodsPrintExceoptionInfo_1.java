package ExceptionHandling.TryCatchBlock2;

public class MethodsPrintExceoptionInfo_1 {
    public static void main(String[] args) {

        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException e){

            // e.printStackTrace(); // internallly contain print statement so no need to use sout

           // when ever we try to print any Exception obj ref internally toString will be called Automatically
           // System.out.println(e);
           // System.out.println(e.toString());//  return String wehic is responsible to print using sout

            System.out.println(e.getMessage()); // return String wehic is responsible to print using sout
        }
    }
}
