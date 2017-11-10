package sample.Data;

import java.util.Date;

/**
 * Created by mosab on 26/07/17.
 */
public class Ticket {
    /* This for the id of the ticket */
    private int id;
    /* This for customer instance */
    private Customer customer;
    /* For the date of the booking */
    private Date date;
    /* The price of the ticket */
    private int price;
    /* For event */
    private String event;

    public Ticket(int id, Customer customer, Date date, int price, String event) {
        this.id = id;
        this.customer = customer;
        this.date = date;
        this.price = price;
        this.event = event;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }
}
