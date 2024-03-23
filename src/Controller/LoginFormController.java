package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {

    public AnchorPane root;
    public static TextField usrname;


    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {

        Parent parent= FXMLLoader.load(this.getClass().getResource("../view/ToDoListForm.fxml"));
        Scene scene=new Scene(parent);

        Stage stage=(Stage) root.getScene().getWindow();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();

    }
}
