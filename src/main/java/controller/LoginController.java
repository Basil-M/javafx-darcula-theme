package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button btnLogin;

    void initializeAction (final Manager manager) {
        btnLogin.setOnAction(event -> {
            manager.doLogin("");
        });
    }

}
