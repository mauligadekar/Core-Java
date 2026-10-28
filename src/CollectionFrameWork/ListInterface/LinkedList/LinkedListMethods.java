package CollectionFrameWork.ListInterface.LinkedList;

import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // 1. Adding elements
        list.add("A");
        list.add("B");
        list.add("D");
        System.out.println(list); // [A, B, D]

        // 2. Add at a specific index
        list.add(2, "C");
        System.out.println(list); // [A, B, C, D]

        // 3. Add at beginning and end
        list.addFirst("Start");
        list.addLast("End");
        System.out.println(list);
        // [Start, A, B, C, D, End]

        // 4. Access elements
        System.out.println(list.get(2));       // B
        System.out.println(list.getFirst());   // Start
        System.out.println(list.getLast());    // End

        // 5. Replace an element
        list.set(1, "X");
        System.out.println(list);
        // [Start, X, B, C, D, End]

        // 6. Remove elements
        list.remove("B");       // Remove by value
        list.remove(1);         // Remove by index
        list.removeFirst();     // Remove first element
        list.removeLast();      // Remove last element
        System.out.println(list); // [C, D]

        // 7. Search elements
        System.out.println(list.contains("C")); // true
        System.out.println(list.indexOf("C"));  // 0

        // 8. Size and empty check
        System.out.println(list.size());    // 2
        System.out.println(list.isEmpty()); // false

        // 9. Queue operations
        System.out.println(list.peek()); // First element, not removed c
        System.out.println(list.poll()); // First element, removed c
        list.offer("Z");                 // Add at the end

        System.out.println(list); // [D, Z]
    }
}
