package sample.Forms;

import javafx.scene.control.Alert;

/**
 * Created by mosab on 26/07/17.
 */
public class PopupMessage {

    public PopupMessage()
    {

    }

    /*  alert Function v1.0
      * This function create alert for you base on your parameter that you pass it
      * Function parameters :
      * type(String)        => This parameter for the message type that you wont(information, error..etc)
      * message(String)     => This parameter for the message that you wont to popup in the alert
      * You can modified it as you like to make sure it help your needs
      * */
    public static void alert(String type, String message)
    {
        if (type.equalsIgnoreCase("info"))
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText(message);
            alert.showAndWait();
        }else if (type.equalsIgnoreCase("error"))
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText(message);
            alert.showAndWait();
        }

    }

}
