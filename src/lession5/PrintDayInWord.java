package lession5;

public class PrintDayInWord {
    public static void main(String[] args) {
        int dayNumber = 1;

        switch (dayNumber) {
            case 2:
                System.out.println("MonDay"); break;
            case 3:
                System.out.println("TuesDay"); break;
            case 4:
                System.out.println("WedNesDay"); break;
            case 5:
                System.out.println("ThursDay"); break;
            case 6:
                System.out.println("FriDay"); break;
            case 7:
                System.out.println("SaturDay"); break;
            case 8:
                System.out.println("SunDay"); break;
            default:
                System.out.println("is not a valid date");
        }
    }
}
