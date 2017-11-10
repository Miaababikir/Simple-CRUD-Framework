package sample.Data;

/**
 * Created by mosab on 26/07/17.
 * For admin operations
 */
public class Admin extends User{

    /* Admin privileges level */
    private String level;

    public Admin(int id, String username, String password, String level) {
        super(id, username, password);
        this.level = level;
    }

    public Admin(String username, String password, String level) {
        super(username, password);
        this.level = level;
    }

    public Admin(String username, String password) {
        super(username, password);
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
