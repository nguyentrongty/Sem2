package demo.lession7;

public class Time {
    //the private instance variable.
    private int second, minute, hour;

    //The constructor
    public Time(int second, int minute, int hour) {
        this.setTime(second, minute, hour);
    }
    public Time() {
        this.second = 0;
        this.minute = 0;
        this.hour = 0;
    }

    // The public setters/getters for the private variable.
    public int getSecond() {
        return this.second;
    }
    public int getMinute() {
        return this.minute;
    }
    public int getHour() {
        return this.hour;
    }
    public void setSecond(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid second!");
        }
    }
    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Invalid minute!");
        }
    }
    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Invalid hour!");
        }
    }

    //Return "HH:MM:SS" with reading zeros.
    public String toString() {
        return String.format("%2d:%2d:%2d", hour, minute, second);
    }

    public void setTime(int second, int minute, int hour) {
        this.setSecond(second);
        this.setMinute(minute);
        this.setHour(hour);
    }

    //Increment this instance by one second, and return this instance.
    public Time nextSecond() {
        ++second;
        if (second >= 60) {
            second = 0;
            ++minute;
            if (minute >= 60) {
                minute = 0;
                ++hour;
                if (hour >= 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }
}
