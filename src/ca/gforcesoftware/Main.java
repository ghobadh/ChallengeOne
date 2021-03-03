package ca.gforcesoftware;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        var invoice = new Invoice("My Invoice", new Date(), 123.45);
        System.out.println(invoice);
    }
}
