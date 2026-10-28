package CollectionFrameWork.ListInterface.Iterator;

//How to Add and Set element in List while Java ListIterator Iterating?

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample_3 {
    public static void main(String[] args) {



        List<String> list = new ArrayList<>();


        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println("List: "+list);

        System.out.println();
        ListIterator<String> listItr = list.listIterator();

        System.out.println("Forward Direction Iteration:");

        while (listItr.hasNext()){

            String str = listItr.next(); // A B C D
            System.out.println(str);
        }

        listItr.add("E"); // Adds an element before the iterator position.
        System.out.println();
        System.out.println(list); // [A, B, C, D, E] consodering this list while replacing

        System.out.println("Backward Direction Iteration:");

        while (listItr.hasPrevious()){

            String str = listItr.previous();  // E D C B A
            System.out.println(str);
        }

        listItr.set("J"); // It will update the last element returned by previous. [J, B, C, D, E]
        System.out.println();
        System.out.println(list); // [J, B, C, D, E]
    }
}
