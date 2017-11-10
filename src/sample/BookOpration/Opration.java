package sample.BookOpration;

/**
 * Created by mosab on 26/07/17.
 * This interface for booking operation that will be implemented in the booking system
 * you should implement this interface in your main booking class that you wont to start
 * putting your code about booking operations and other functionality
 */
public interface Opration {

    /*
    * IsAvailable function v1.0
    * This function will check the availability about booking and will return true if
    * it's available and false if it's not
    * You can modified it to help your system needs
    * */
    boolean isAvailable();

    /*
    * GetInfo function v1.0
    * This function for getting information about the booking and
    *
    * */
    Book getInfo();
    boolean book();
    boolean cancelBook();
    boolean updateBook();


}
