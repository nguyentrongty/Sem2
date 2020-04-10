package lession21;

import java.util.ArrayList;
import java.util.List;
public class CreateArrayListExample {

    public static void main(String[] args) {
        // Creating an arraylist of String.
        List<String> animals = new ArrayList<>();

        // Adding new element to the ArrayList.
        animals.add("lion");
        animals.add("tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);

        // Adding an element at a particular index in an ArrayList.
        animals.add(2, "Elephant");

        System.out.println(animals);
    }
}
