package sample.Database;

/**
 * Created by mosab on 26/07/17.
 */
public interface Setup {

    /* ----  Slot Function  ----
    * This function should be overridden in the subclass and put all the code for
    * creating tables here because it will be called in the constructor
    * */
    public void setupTables();

}
