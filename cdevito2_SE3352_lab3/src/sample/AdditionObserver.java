package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AdditionObserver extends Observer {

    public AdditionObserver(Subject s) {
        _subject = s;
        _subject.attach(this);
    }

    public void update() {
        int ans = _subject.getAdditionState();
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("addition.fxml"));
            Parent root = loader.load();
            AdditionController x = loader.getController();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Addition Window");
            x.initData(ans);
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
