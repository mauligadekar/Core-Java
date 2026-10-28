package CollectionFrameWork.ListInterface.LinkedList;

import java.util.LinkedList;

public class IterateUsingAdvanceForLoop1 {
    public static void main(String[] args) {

        // Create a LinkedList object of string type.
        LinkedList<String> fruits = new LinkedList();

// Adding elements of only string type.
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple");

// Iterating using advanced for loop.
        System.out.println("**Advanced For loop**");
        for(String str: fruits)
        {
            System.out.println(str);
        }
    }
}
