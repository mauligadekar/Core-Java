package CollectionFrameWork.ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class WaysToIterateArrayList {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");

        System.out.println(al);

        System.out.println("Using for loop");

        int elementsSize = al.size();
        System.out.println(elementsSize);

        String getElements;
        for (int i = 0; i < al.size(); i++) {

            getElements = al.get(i);
            System.out.println(getElements);
        }

        // Iterating ArrayList using Enhance for loop.

        System.out.println("Iterate Using  Enhance for loop");
        for (String elements : al){
            System.out.println(elements);
        }

        // Iterate ArrayList in Java using Iterator

        System.out.println("Iterate Using Iterator");
        Iterator<String> itr = al.iterator();

        while (itr.hasNext()){

            String str = itr.next();
            System.out.println(str);
        }

        // Iterate ArrayList Using Stream API in Java 8
        System.out.println("Iterate ArrayList Using Stream API in Java 8");

        al.stream().forEach(System.out::println);

    }
}
