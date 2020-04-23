package demo.lession7;

public class TestTime {
    public static void main(String[] args) {
        //Test constructor and toString.
        Time t1 = new Time(1, 2, 5);
        System.out.println(t1);
        Time t2 = new Time();
        System.out.println(t2);

        //Test setters and getters
        t1.setHour(4);
        t1.setMinute(6);
        t1.setSecond(6);
        System.out.println(t1);
        System.out.println("Hour is : " + t1.getHour());
        System.out.println("Minute is : " + t1.getMinute());
        System.out.println("Second is : " + t1.getSecond());

        //Test setTime.
        t1.setTime(58, 59, 23);
        System.out.println(t1);

        //Test nextSecond and chaining.
        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond().nextSecond());
    }
}
