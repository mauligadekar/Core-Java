package CollectionFrameWork.ListInterface.ArrayList.ArrayListPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class Example_3 {
    public static void main(String[] args) {

        // Creates an ArrayList with an initial capacity of 10.
        ArrayList<String> arlist = new ArrayList<String>();

        arlist.add("Ganga");
        arlist.add("Yamuna");
        arlist.add(null); // Adding null element.
        arlist.add("Godavari");
        arlist.add("Ganga"); // Adding duplicate element.
        arlist.add(null); // Adding null element.
        System.out.println("Original order: " +arlist);

        Iterator<String> itr = arlist.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}

// We can add any number of null elements in ArrayList
