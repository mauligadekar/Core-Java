package ExceptionHandling.Top10Exceoption;

public class ClassCastException4 {
    public static void main(String[] args) {

        String str = new String("Mauli");

        Object obj = (Object) str;

        System.out.println(obj);

//        Object obj = new Object();
//
//        String str = (String) obj; // Object to String typecasting
//
//        System.out.println(str); // classCastException

    }
}

// every child object we can convert inot parent its valid
// but we cannot convert parent to  child object (classCastEx)