package ExceptionHandling.Top10Exceoption;

public class NullPointerException2 {
    public static void main(String[] args) {

//        String s = null;
//        System.out.println(s.length());

        try{
            String s = null;
            System.out.println(s.length());
        }
        catch (NullPointerException npe){
            System.out.println("Caugth NullPointerException" + npe.getMessage());
        }
    }
}
