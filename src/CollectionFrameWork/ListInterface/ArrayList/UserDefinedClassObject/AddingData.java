package CollectionFrameWork.ListInterface.ArrayList.UserDefinedClassObject;

import java.util.ArrayList;

public class AddingData {

    // Create a ArrayList method

    ArrayList<Student> studentData(){

        // Create three objects of the class Student and pass arguments to the constructor.
        Student s1 = new Student("Deep", 1234, 04);
        Student s2 = new Student("Shubh", 4321, 20 );
        Student s3 = new Student("Riddhi", 1212, 02);

        // Create the object of ArrayList
        ArrayList<Student> std = new ArrayList<Student>();

        std.add(s1);
        std.add(s2);
        std.add(s3);

        return std;
    }
}
