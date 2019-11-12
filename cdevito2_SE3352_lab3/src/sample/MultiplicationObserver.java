package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MultiplicationObserver extends Observer {

    public MultiplicationObserver(Subject s) {
        _subject = s;
        _subject.attach(this);
    }

    public void update() {
        int answer = _subject.getMultiplicationState();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("multiplication.fxml"));
            Parent root = fxmlLoader.load();
            MultController x = fxmlLoader.getController();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Multiplication Window");
            x.initData(answer);
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }


}