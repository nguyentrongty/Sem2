package lession21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Collection {

    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(13);
        number.add(32);
        number.add(9);
        number.add(32);
        number.add(27);

        System.out.println("Before : " + number);

        //Sorting an ArrayList using Collections.Sort() method.
        Collections.sort(number);
        System.out.println("After : " + number);
    }
}
