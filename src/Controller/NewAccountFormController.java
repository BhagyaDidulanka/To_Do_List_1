package Controller;

import db.DBConnection;
import db.DBConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
    public Label lblID;

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

//        DBConnection object = DBConnection.getInstance();
//
//        Connection connection = object.getConnection();
//        System.out.println(connection);

        autoGenerateID();
    }

    public void autoGenerateID(){
        Connection connection = DBConnection.getInstance().getConnection();
        try {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select id from user order by id desc limit 1");

            boolean isExit = resultSet.next();

            if(isExit){
                String userID = resultSet.getString(1);

                userID=userID.substring(1,userID.length());

                int intID = Integer.parseInt(userID);

                intID++;

               if(intID<10){
                    lblID.setText("U00"+intID);
               }else if(intID<100){
                    lblID.setText("U0"+intID);
               }else {
                    lblID.setText("U"+intID);
               }

            }else{
                lblID.setText("U001");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
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

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent= FXMLLoader.load(this.getClass().getResource("../view/LoginForm.fxml"));
        Scene scene=new Scene(parent);

        Stage stage=(Stage) root.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Login Page");
        stage.centerOnScreen();
        stage.show();
    }
}
