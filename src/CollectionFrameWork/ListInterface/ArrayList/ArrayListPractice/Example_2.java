package CollectionFrameWork.ListInterface.ArrayList.ArrayListPractice;

import java.util.ArrayList;

public class Example_2 {
    public static void main(String[] args) {

        // Create an array list with an initial capacity of 6.
        ArrayList<Integer> al = new ArrayList<Integer>(6);
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);
        System.out.println(al);

        Integer sizelist = al.size();
        System.out.println("Original size: " +sizelist);

        // Since the initial capacity of array list is full,
        // Therefore, when we add a new element to the list, its capacity is automatically grown by 50%.
        al.add(70);
        al.add(80);
        Integer size = al.size();
        System.out.println("After adding new elements, ArrayList's size: " +size);

        al.remove(6);
        System.out.println(al);
    }
}

// ArrayList is that the size of ArrayList is growable in nature.