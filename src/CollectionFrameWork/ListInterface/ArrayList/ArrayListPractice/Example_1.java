package CollectionFrameWork.ListInterface.ArrayList.ArrayListPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class Example_1 {
    public static void main(String[] args) {

        // Create an ArrayList with an initial capacity of 10.
        ArrayList<String> al = new ArrayList<String>();

        // Adding elements to the list.
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        System.out.println("Original insertion array list order: " +al);

        // Adding a duplicate element at position 2 and end of the list.
        al.add(2, "B");
        al.add("A");
        System.out.println("After adding duplicate element, ArrayList insertion order ");

        // Call iterator() method to iterate over the elements of the array list.
        Iterator<String> itr = al.iterator();
        while(itr.hasNext())
        {
            String str = itr.next();
            System.out.println(str);
        }
    }
}

// 1. We want to add duplicate elements to the list.