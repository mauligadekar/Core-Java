package CollectionFrameWork.ListInterface.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class listIteratorExample_2 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Yellow");
        list.add("Orange");
        list.add("Blue");
        list.add("White");

        System.out.println("List: " + list);

        // ListIterator object

        ListIterator<String> listItr = list.listIterator();
        System.out.println();

        System.out.println("List Iterator in Forward Direction:");

        while (listItr.hasNext()){

            String str = listItr.next();
            System.out.println(str);
        }

        System.out.println();
        System.out.println("List Iterator in Backward Direction:");

// Reuse the Java list iterator to iterate from the end to the beginning.

        while (listItr.hasPrevious()){

            String str = listItr.previous();
            System.out.println(str);
        }

    }
}
