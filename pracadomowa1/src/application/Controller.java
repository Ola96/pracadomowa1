package application;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public Label label;
    public TextField text_1;
    public TextField text_2;




    public void handleClick(ActionEvent actionEvent) {
    	label.setText(text_1.getText()+text_2.getText());
    }
    	

}