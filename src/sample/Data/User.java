package sample.Data;

/**
 * Created by mosab on 26/07/17.
 * For user operations
 */
public class User {

    /* User dynamic */
    private int id;
    /* Username */
    private String username;
    /* User password */
    private String password;

    /* Constructor to initiate user data */
    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
