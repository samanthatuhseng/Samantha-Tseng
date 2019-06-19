package sample;

import java.time.LocalDate;
import java.util.Date;

public class Patient {
    private String name;
    private int hour;
    int min;
    private LocalDate date;

    public Patient(String name, int hour, int min, LocalDate date) {
        this.name = name;
        this.hour = hour;
        this.min = min;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return hour + ":" + min;
    }



    @Override
    public String toString() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


}
