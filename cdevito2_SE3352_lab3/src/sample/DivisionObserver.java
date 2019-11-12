package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class DivisionObserver extends Observer {

    @FXML
    private Label divisionLabel;

    public DivisionObserver(Subject s) {
        _subject = s;
        _subject.attach(this);
    }



    public void update() {
        int temp = _subject.getDivisionState();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("division.fxml"));
            Parent root = fxmlLoader.load();
            DivisionController x = fxmlLoader.getController();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Division Window");
            x.initData(temp);
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    //@FXML
    //public void setDivisionText(int a) {
     //   divisionLabel.setText("The division is: " + (a));
    //}
}