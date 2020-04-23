package lession18;

public class Monster {

    //private instance variable.
    private String name;

    //Constructor a monster instance with the given name.
    public Monster(String name) {
        this.name = name;
    }

    //defines a common behavior called attack() for its subclasses.
    public String attack() {
        return "!^_&^$&+%$* I don't known how to attack!";
    }
}
