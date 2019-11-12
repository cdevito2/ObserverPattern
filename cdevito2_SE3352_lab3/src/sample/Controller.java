package sample;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;




public class Controller implements Initializable {


    @FXML
    private Label label;
    @FXML
    private Button saveBtn;
    @FXML
    private TextField aaText;
    @FXML
    private TextField bbText;


    @FXML
    private void handleButtonAction(ActionEvent event) throws Exception {
            try {

                Subject sub = new ConcreteSubject();
                new AdditionObserver(sub);
                new MultiplicationObserver(sub);
                new DivisionObserver(sub);

                String aa = aaText.getText();
                String bb = bbText.getText();

                int state1 = Integer.parseInt(aa);
                int state2 = Integer.parseInt(bb);
                sub.setState(state1,state2);

            } catch(Exception e) {
                e.printStackTrace();
            }
        }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //TODO
    }

}
