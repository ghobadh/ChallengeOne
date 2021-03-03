package ca.gforcesoftware;

import java.util.Date;

public class Invoice {
    private String title;
    private Date date;
    private double value;

    public Invoice(String title, Date date, double value) {
        this.title = title;
        this.date = date;
        this.value = value;
    }


    @Override
    public String toString() {
        return "Invoice{" +
                "title='" + title + '\'' +
                ", date=" + date +
                ", value=" + value +
                '}';
    }
}
