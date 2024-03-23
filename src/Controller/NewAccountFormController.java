package Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class NewAccountFormController {

    public AnchorPane root;
    public PasswordField txtNewPassword;
    public PasswordField txtConformPassword;
    public Label lblPasswordNotMatch_1;
    public Label lblPasswordNotMatched_2;

    public void initialize(){
        setVisible(false);
    }
    public void btnRegisterOnAction(ActionEvent actionEvent) {
        String newPassword = txtNewPassword.getText();
        String conformPassword = txtConformPassword.getText();

        if(newPassword.equals(conformPassword)){
            setVisible(false);
            setBorderColor("transparent");
        }else{
            setBorderColor("red");
            setVisible(true);
            txtNewPassword.clear();
            txtConformPassword.clear();

            txtNewPassword.requestFocus();
        }

    }

    public void setBorderColor(String color){
        txtNewPassword.setStyle("-fx-border-color: "+color);
        txtConformPassword.setStyle("-fx-border-color: "+color);
    }

    public void setVisible(boolean value){
        lblPasswordNotMatch_1.setVisible(value);
        lblPasswordNotMatched_2.setVisible(value);
    }
}
