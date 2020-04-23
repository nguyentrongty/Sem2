package demo.lession7;

public class Date {
    //The private instance variable.
    private int year, month, day;

    //The constructor
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //The public getters/setters for the private variable.
    public int getYear() {
        return this.year;
    }
    public int getMonth() {
        return this.month;
    }
    public  int getDay() {
        return this.day;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setDay(int day) {
        this.day = day;
    }

    //Return "MM/DD/YYYY" with leading zero for MM and DD.
    public String toString() {
        return String.format("%2d/%2d/%4d", month, day, year);
    }
    public void setDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
}
