package sample.BookOpration;

/**
 * Created by mosab on 26/07/17.
 * For booking operation that are common you can modified and add more functionality
 */
public class BookOperation implements Opration {

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public Book getInfo() {
        return null;
    }

    @Override
    public boolean book() {
        return false;
    }

    @Override
    public boolean cancelBook() {
        return false;
    }

    @Override
    public boolean updateBook() {
        return false;
    }
}
