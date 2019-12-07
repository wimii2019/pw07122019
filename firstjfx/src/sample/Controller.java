package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    TextField aTF, bTF, wTF;
    @FXML
    Button a,b,c,d;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("initialize");

    }


    public void licz(ActionEvent actionEvent) {
        if(actionEvent.getSource()==a){
            wTF.setText(String.valueOf(Double.valueOf(aTF.getText())+Double.valueOf(bTF.getText())));
        }
        if(actionEvent.getSource()==b){
            wTF.setText(String.valueOf(Double.valueOf(aTF.getText())-Double.valueOf(bTF.getText())));
        }
        if(actionEvent.getSource()==c){
            wTF.setText(String.valueOf(Double.valueOf(aTF.getText())*Double.valueOf(bTF.getText())));
        }
        if(actionEvent.getSource()==d){
            if (Double.valueOf(bTF.getText())==0){
                wTF.setText("NaN");
                return;
            }
            wTF.setText(String.valueOf(Double.valueOf(aTF.getText())/Double.valueOf(bTF.getText())));
        }
    }
}
