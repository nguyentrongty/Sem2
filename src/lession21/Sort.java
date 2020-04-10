package lession21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Sort {

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("tri");
        name.add("Anh");
        name.add("prang");
        name.add("son");
        name.add("hoa");

        System.out.println("Name : " + name);

        // Sort an arraylist using its sort() method. You must pass a Comparator to the ArrayList.sort() method.
        name.sort(new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return name1.compareTo(name2);
            }
        });

        //the above 'sort()' method call can also be written simply using lambda expression.
        name.sort((name1, name2) -> name1.compareTo(name2)) ;

        //Following is an even more concise solution
        name.sort(Comparator.naturalOrder());

        System.out.println("Sorted Name : " + name);
    }
}
