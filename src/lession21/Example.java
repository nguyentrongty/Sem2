package lession21;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class Example {

    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(13);
        number.add(18);
        number.add(25);
        number.add(40);
        Iterator<Integer> numberIterate = number.iterator();
        while (numberIterate.hasNext()) {
            Integer num = numberIterate.next();
            if (num % 2 == 0) {
                numberIterate.remove();
            }
        }
        System.out.println(number);
    }
}
