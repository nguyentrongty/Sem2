package lession14;

public class TestAuthor {
    public static void main(String[] args) {
        // Test constructor and toString().
        Author ahTech = new Author("Tan ah Tech", "Tech@nowhere.com", 'm');
        System.out.println(ahTech);

        //Test setters and getters.
        ahTech.setEmail("Tech@none.com");
        System.out.println(ahTech);
        System.out.println("Name is : " + ahTech.getName());
        System.out.println("Gender is : " + ahTech.getGender());
        System.out.println("Email is : " + ahTech.getEmail());
    }
}
