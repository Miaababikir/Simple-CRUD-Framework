package sample.Forms;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

/**
 * Created by mosab on 26/07/17.
 */
public class SceneOpration {

    public SceneOpration()
    {

    }

    /*
    * loadScreen Function v1.0
    * This function will change the screen depends on the parameter
    * Function parameter :
    * loc(String)   => This parameter for the location or the url of your graphical interface
    * title(String) => This parameter for the title of your graphical interface
    * */
    public void loadScreen(String loc, String title)
    {

        try {
            Parent root= FXMLLoader.load(getClass().getResource(loc));
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle(title);
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
