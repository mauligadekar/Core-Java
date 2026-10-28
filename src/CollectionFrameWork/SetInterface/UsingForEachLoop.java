package CollectionFrameWork.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class UsingForEachLoop {
    public static void main(String[] args) {

        Set<Character> s = new HashSet<>();
        s.add('A');
        s.add('B');
        s.add('C');
        s.add('D');
        s.add('E');
        System.out.println(s);

        System.out.println("Iterating using forEach loop in Java 1.8");
        s.forEach(System.out::println);
    }
}
