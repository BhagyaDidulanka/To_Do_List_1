package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {

    //public AnchorPane root;
    public static TextField usrname;
    public AnchorPane root;


    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {

        Parent parent= FXMLLoader.load(this.getClass().getResource("../view/ToDoListForm.fxml"));
        Scene scene=new Scene(parent);

        Stage stage=(Stage) root.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("To Do List");
        stage.centerOnScreen();
        stage.show();

    }

    public void lblCreateNewAccountOnMouseClick(MouseEvent mouseEvent) throws IOException {
        Parent parent=FXMLLoader.load(this.getClass().getResource("../view/NewAccountForm.fxml"));
        Scene scene=new Scene(parent);

        Stage stage=(Stage) root.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Create New Account");
        stage.centerOnScreen();
        stage.show();
    }
}
