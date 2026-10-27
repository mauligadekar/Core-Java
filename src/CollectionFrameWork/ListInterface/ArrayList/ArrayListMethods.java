package CollectionFrameWork.ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {

        // 1. Create an ArrayList
        ArrayList<String> names = new ArrayList<>();

        // boolean add(Object o):  - Adds an element
        names.add("Mauli");
        names.add("Rahul");
        names.add("Amit");
        names.add("Rahul");

        System.out.println(names); // [Mauli, Rahul, Amit, Rahul]

        // 3. add(index, element) - Adds at a specific index
        names.add(1, "Priya");
        System.out.println(names); // [Mauli, Priya, Rahul, Amit, Rahul]

        // void add(int index, Object o): It is used to add an element at a particular position index in the list.

        // 4. get(index) - Returns the element at an index
        System.out.println(names.get(0)); //[Mauli]

        // 5. set(index, element) - Replaces an existing element with the specified element.
        names.set(0, "Mohan");
        System.out.println(names); // // [Mohan, Priya, Rahul, Amit, Rahul]

        // 6. remove(index) - Removes an element by index
        names.remove(1); // Priya Removed

        // 5. boolean remove(Object o): - Removes the first matching object
        // why Object => to remove elements internally we have to comapre each elemts and equals method is present in Object class.
        names.remove("Rahul");
        System.out.println(names); // [Mohan, Amit, Rahul]

        // void remove(int index): This method removes the element from a particular position in the list

        // 7.Object get(int index): - Returns the number of elements
        System.out.println(names.size()); // 3

        // 8. boolean contains(Object o) - Checks whether an element exists
        System.out.println(names.contains("Amit")); // true

        // 9. indexOf() - Returns the first matching index
        System.out.println(names.indexOf("Rahul")); // 2

        // 10. lastIndexOf() - Returns the last matching index
        System.out.println(names.lastIndexOf("Rahul")); // 2

        // 11. isEmpty() - Checks whether the list is empty
        System.out.println(names.isEmpty()); // false

        // 12. boolean addAll(Collection c):  -  used to add a group of elements in a particular collection at the end of the list.
        List<String> moreNames = Arrays.asList("Sneha", "Kiran");
        names.addAll(moreNames);
        System.out.println(names); // [Mohan, Amit, Rahul, Sneha, Kiran]

       // . boolean addAll(int index, Collection c): To add group of elements at specific position

        // 13. removeAll() - Removes elements found in another collection
        names.removeAll(moreNames);
        System.out.println(names); // [Mohan, Amit, Rahul]

        // 14. clear() - Removes all elements
        // names.clear();

        // 15. toArray() - Converts the list into an array
       // String[] arr = names.toArray(new String[0]);

        // 16. Collections.sort() - Sorts elements alphabetically
        Collections.sort(names);
        System.out.println(names); // [Amit, Mohan, Rahul]

        // 17. forEach() - Performs an action for each element
        names.forEach(name -> System.out.println(name));


    }
}
