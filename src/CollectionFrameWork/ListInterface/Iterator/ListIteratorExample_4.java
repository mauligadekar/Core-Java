package CollectionFrameWork.ListInterface.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample_4 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println("List: "+list); // List: [A, B, C, D]

        ListIterator<String> listItr = list.listIterator();
        System.out.println("Forward Direction Iteration:");

        while(listItr.hasNext()) {
            System.out.println(listItr.next());
        }
        listItr.remove(); // Removes the last element returned by next method.
        System.out.println("New List: " +list); // [A, B, C]
    }
}
