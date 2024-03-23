package Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
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
    public Button btnRegister;
    public Label lblConformPassword;
    public Label lblNewPassword;
    public TextField txtEmail;
    public Label lblEmail;
    public TextField txtUserName;
    public Label lblUserName;

    public void initialize(){
        setVisible(false);

        setDisable(true);

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

    public void btnAddNewUserOnAction(ActionEvent actionEvent) {

        setDisable(false);
        txtUserName.requestFocus();
    }

    public void setDisable(boolean value_1){
        lblUserName.setDisable(value_1);
        txtUserName.setDisable(value_1);
        lblEmail.setDisable(value_1);
        txtEmail.setDisable(value_1);
        lblNewPassword.setDisable(value_1);
        txtNewPassword.setDisable(value_1);
        lblPasswordNotMatch_1.setDisable(value_1);
        lblConformPassword.setDisable(value_1);
        txtConformPassword.setDisable(value_1);
        lblPasswordNotMatched_2.setDisable(value_1);
        btnRegister.setDisable(value_1);
    }
}
