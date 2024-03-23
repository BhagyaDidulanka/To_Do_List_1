package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class ToDoListFormController<text> {

    public AnchorPane root;
    public Label msgWelcome;
    public Pane subRoot;
    public TextField txtDescription;
    public Label srId;

    public void initialize(){

    }
    public void btnDeleteOnAction(ActionEvent actionEvent) {

    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {

    }

    public void btnAddToDoListOnAction(ActionEvent actionEvent) {

    }

    public void btnAddToListOnAction(ActionEvent actionEvent) {


    }

    public void btnLogOutOnAction(ActionEvent actionEvent) {

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
