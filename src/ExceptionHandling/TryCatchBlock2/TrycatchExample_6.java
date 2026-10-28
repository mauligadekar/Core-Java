package ExceptionHandling.TryCatchBlock2;

public class TrycatchExample_6 {
    public static void main(String[] args) {

        try
        {
            int a[] = {20, 30, 40, 50};
            a[10] = 5;
        }
        catch(ArrayIndexOutOfBoundsException a)
        {
            System.out.println("Array Index Out Of Bounds Exception"); // 1
        }
  }
}
