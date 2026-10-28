package CollectionFrameWork.ListInterface.ArrayList.ArrayListPractice;

import java.util.ArrayList;

public class Example_4 {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("a");
        al.add("ab");
        al.add("abc");
        al.add("abcd");
        al.add("a");
        System.out.println(al);

// Call get() method using reference variable al to get elements.

        System.out.println("Getting element from position 0 to 4 ");
        for(int i = 0; i < 4 ; i++)
        {
            String getElement = al.get(i);
            System.out.println(getElement);
        }
        String getE = al.get(3); // Randomly getting element from position 3.
        System.out.println("Getting element at position 3: " +getE);
    }
 }
// ArrayList implements a random access interface.
