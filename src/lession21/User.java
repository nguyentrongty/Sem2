package lession21;

import java.util.ArrayList;
import java.util.List;

class users {
    private String name;
    private int age;

    public users (String name, int age) {
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
}
public class User {

    public static void main(String[] args) {
        List<users> User = new ArrayList<>();
        User.add(new users("tri", 27));
        User.add(new users("anh", 24));
        User.add(new users("zon", 21));

        User.forEach(users -> {
            System.out.println("Name : " + users.getName() + ", age :" + users.getAge());
        });
    }
}
