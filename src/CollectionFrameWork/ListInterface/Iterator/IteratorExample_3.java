package CollectionFrameWork.ListInterface.Iterator;

import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

public class IteratorExample_3 {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

// Adding elements in the array list.
        collection.add("Red");
        collection.add("Green");
        collection.add("Black");
        collection.add("White");
        collection.add("Pink");

        Iterator<String> itr = collection.iterator();

        while (itr.hasNext()){

            System.out.println(itr.next().toUpperCase() + " ");
        }

        System.out.println();
    }
}
