package ExceptionHandling.MultipleCatchBlock3;

public class MultiCatchExample_2 {
    public static void main(String[] args) {

        String s = "Scientech Easy";
        int a[] = {0, 1, 2, 3, 4, 5};
        try
        {
            s = null;
            int sLength = s.length();
            System.out.println("String length: " +sLength);
            int b = 6;
            System.out.println(a[b]);
        }
        catch(NullPointerException npe)
        {
            System.out.println("Exception is caught"); // 1
            System.out.println(npe.toString());
        }
        catch(ArrayIndexOutOfBoundsException aie)
        {
            System.out.println("Exception is caught");
            System.out.println(aie.toString());
        }
    }
}
