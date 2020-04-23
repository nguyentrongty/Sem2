package demo.lession7;

public class TestDate {
    public static void main(String[] args) {
        // Test constructor and toString.
        Date d1 = new Date(2016, 4, 6);
        System.out.println(d1);

        //Test Setter and getter.
        d1.setYear(2012);
        d1.setMonth(12);
        d1.setDay(43);
        System.out.println(d1);
        System.out.println("Year is : " + d1.getYear());
        System.out.println("Month is : " + d1.getMonth());
        System.out.println("Day is : " + d1.getDay());

        //Test setDay.
        d1.setDate(2988, 1, 2);
        System.out.println(d1);
    }
}
