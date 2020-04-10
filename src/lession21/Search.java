package lession21;

import java.util.ArrayList;
import java.util.List;
public class Search {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tri");
        names.add("prang");
        names.add("Anh");
        names.add("Son");
        names.add("hoa");
        names.add("Tri");
        names.add("prang");

        //Check if an ArrayList contains a given element.
        System.out.println("Does names array contain \"Anh\" ?: " + names.contains("Anh"));

        //Find the index of the first occurrence of an element in an ArrayList.
        System.out.println("indexOf \"prang\": " + names.indexOf("prang"));
        System.out.println("indexOf \"Mark\" : " + names.indexOf("Mark"));

        //Find the index of the last occurrence of an element in an Arraylist.
        System.out.println("LastIndexOf \"Tri\" : " + names.lastIndexOf("Tri"));
        System.out.println("LastIndexOf \"prang\": " + names.lastIndexOf("prang"));
    }
}
