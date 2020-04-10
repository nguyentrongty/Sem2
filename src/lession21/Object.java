package lession21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                '}';
    }
}
public class Object {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("aChin", 47));
        people.add(new Person("Chris", 34));
        people.add(new Person("Son", 54));
        people.add(new Person("hoa", 37));

        System.out.println("Person List :" + people);

        //Sort people by their age.
        people.sort((person1,person2) -> {
            return person1.getAge() - person2.getAge();
        });

        //A more concise way of writing the above sorting function.
        people.sort(Comparator.comparing(Person::getAge));
        System.out.println("Sorted Person List bey Age :" + people);

        //You can also sort using Collections.Sort() method by passing the custom comparator.
        Collections.sort(people, Comparator.comparing(Person::getName));
        System.out.println("Sort person list by name : " + people);
    }
}
