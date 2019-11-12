package sample;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;



public class MultController implements Initializable {


    @FXML
    private Label multiplicationLabel;

    @FXML
    void initData(int x) {

        multiplicationLabel.setText("the multiplication result is: "+(x));
    }



    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //TODO
    }


}
