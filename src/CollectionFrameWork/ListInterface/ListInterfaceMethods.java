package CollectionFrameWork.ListInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListInterfaceMethods {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        // 1. boolean add(E element)

        list.add("A");
        list.add("C");
        System.out.println("List: " + list); // [A, C]


        // 2. void add(int index, E element)
        // Inserts an element at a specified index.

        list.add(1, "B");
        System.out.println("After inserting B at index 1: " + list); // [A, B, C]

        // 3. boolean addAll(Collection c)
       // Adds all elements of another collection at the end.

        List<String> list2 = Arrays.asList("D", "E");
        list.addAll(list2);
        System.out.println("After adding D and E: " + list); // [A, B, C, D, E]

        // 4. boolean addAll(int index, Collection c)
        // Inserts all elements of another collection at a specified index.
        List<String> list3 = Arrays.asList("P", "Q");
        list.addAll(2, list3);
        System.out.println("After inserting P and Q: " + list); // [A, B, P, Q, C, D, E]

        // 5. E remove(int index)
        // Removes and returns the element at the specified index.

        String removed = list.remove(2);
        System.out.println("Removed element: " + removed); // P
        System.out.println("List: " + list); // [A, B, Q, C, D, E]

        // 6. E get(int index)

        System.out.println("Element at index 1: " + list.get(1)); // B


        // 8. int lastIndexOf(Object o)

        System.out.println("Last index of A: " + list.lastIndexOf("A")); // 0
        System.out.println("Index of Z: " + list.lastIndexOf("Z")); // -1 No exist


        // 9. E set(int index, E element)

        String oldValue = list.set(1, "Z");
        System.out.println("Replaced element: " + oldValue); // B
        System.out.println("Updated list: " + list); // [A, Z, Q, C, D, E]


        // 10. ListIterator<E> listIterator()

        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
