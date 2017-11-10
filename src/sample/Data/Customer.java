package sample.Data;

/**
 * Created by mosab on 26/07/17.
 * For customer operations
 */
public class Customer extends User {


    public Customer(int id, String username, String password) {
        super(id, username, password);
    }

    public Customer(String username, String password) {
        super(username, password);
    }
}
