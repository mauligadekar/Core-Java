package CollectionFrameWork.SetInterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethods {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        // 1. add() - Add unique elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); // Duplicate ignored
        System.out.println(set); // [10, 20, 30] (order may vary)

        // 2. contains() - Check element
        System.out.println(set.contains(20)); // true

        // 3. remove() - Remove element
        set.remove(10);

        // 4. size() - Count elements
        System.out.println(set.size()); // 2

        // 5. isEmpty() - Check whether empty
        System.out.println(set.isEmpty()); // false

        // 6. addAll() - Add another collection
        set.addAll(Arrays.asList(40, 50)); // [20, 30, 40, 50]

        // 7. containsAll() - Check all elements
        System.out.println(set.containsAll(
                Arrays.asList(20, 40))); // true

        // 8. removeAll() - Remove specified elements
        set.removeAll(Arrays.asList(40, 50)); // [20, 30]

        // 9. retainAll() - Keep only common elements
        set.retainAll(Arrays.asList(20, 30)); // true

        // 10. iterator() - Traverse elements
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next()); // 20, 30
        }

        // 11. clear() - Remove everything
        set.clear();
        System.out.println(set.isEmpty()); // true
    }
}
