package sample.BookOpration;

import sample.Data.Customer;
import sample.Data.Ticket;

/**
 * Created by mosab on 26/07/17.
 * This class for basic booking operations and you can used it or inherit from this class
 * and modify whatever you like it's just basic functionality
 */
public class Book {

    /* Instance from BookOperation to get advantage of it's functionality */
    private BookOperation operation;
    /* Instance from Ticket */
    private Ticket ticket;
    /* Instance form customer */
    private Customer customer;

    /* Constructor to initiate class variables */
    public Book(BookOperation operation, Ticket ticket, Customer customer) {
        this.operation = operation;
        this.ticket = ticket;
        this.customer = customer;
    }




}
