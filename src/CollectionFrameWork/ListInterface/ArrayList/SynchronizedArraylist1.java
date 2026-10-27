
package CollectionFrameWork.ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedArraylist1 {
    public static void main(String[] args) {

        List<String> l = new ArrayList<>();

        l.add("Apple");
        l.add("Orange");
        l.add("Banana");
        l.add("Pineapple");
        l.add("Guava");

        // Create a synchronized wrapper around the list.
        List<String> synclist = Collections.synchronizedList(l);

        // Use the same list reference for synchronization.
        synchronized (synclist) {

            // Create an iterator to traverse the list.
            Iterator<String> itr = synclist.iterator();

            while (itr.hasNext()) {
                String str = itr.next();
                System.out.println(str);
            }
        }
    }
}

// Collections.synchronizedList() does not automatically make an entire iteration thread-safe.
// You must synchronize the iteration block manually.