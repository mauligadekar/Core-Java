package CollectionFrameWork.ListInterface.ArrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {


// Create a generic Arraylist object of String type.
// This means the compiler will show an error if we try to put any other element than String.

            ArrayList<String> al = new ArrayList<String>(); // Default capacity is 10.

// Adding elements of String type.

            al.add("A");
            al.add("B");
            al.add("C");
            al.add("D");
            al.add(null); // null allowed
            al.add("D"); // Duplicated Llowed

            System.out.println(al); // [A, B, C, D, null, D]
        }
}
