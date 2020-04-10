package lession21;

import java.util.ArrayList;
import java.util.List;
public class RemoveElement {

    public static void main(String[] args) {
        List<String> program = new ArrayList<>();
        program.add("c++");
        program.add("java");
        program.add("HTML");
        program.add("CSS");
        program.add("Kotlin");
        program.add("python");
        program.add("Ruby");

        System.out.println("Initial List" + program);

        //Remove the element at index 5.
        program.remove(5);
        System.out.println("After Remove : " + program);

        //Remove the first occurrence of the given element from the ArrayList.
        //(The remove() method return false if element does not exist in the ArrayList)
        boolean isRemove = program.remove("Kotlin");
        System.out.println("After Remove (\"Kotlin\")" + program);

        //Remove all the element that exist in a given collection.
        List<String> scrip = new ArrayList<>();
        scrip.add("python");
        scrip.add("Ruby");
        scrip.add("Perl");

        program.removeAll(scrip);
        System.out.println("After removeAll(scrip : )" + program);

        //Remove all the element that satisfy the given predicate.
        //Program.removeIf(s -> s.startWith("c"))
        System.out.println("After Removing all element that start with \"c\": " + program);

        //Remove all element from the Arraylist.
        program.clear();
        System.out.println("After Clear () :" + program);

    }
}
