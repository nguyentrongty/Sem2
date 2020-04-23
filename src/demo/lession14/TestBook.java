package lession14;

public class TestBook {
    public static void main(String[] args) {

        Author ahTech = new Author("Tran Quy", "Nguyen@uber.com", 'D');
        System.out.println(ahTech);

        Book dummyBook = new Book("Java for jumbi", ahTech, 9.99, 99);
        System.out.println(dummyBook);

        dummyBook.setPrice(8.88);
        dummyBook.setQty(88);
        System.out.println("Name is : " + dummyBook.getName());
        System.out.println("Price is : " + dummyBook.getPrice());
        System.out.println("Qty is : " + dummyBook.getQty());
        System.out.println("Author is : " + dummyBook.getAuthor());
        System.out.println("author's Name is " + dummyBook.getAuthor().getName());
        System.out.println("author's Email is " + dummyBook.getAuthor().getEmail());
        System.out.println("author's Gender is " + dummyBook.getAuthor().getGender());

        Book moreDummyBook = new Book("Java for more dummies",
                new Author("Peter Lee", "Peter@nowhere.com", 'm'),19.99, 9);
        System.out.println(moreDummyBook);
    }
}
