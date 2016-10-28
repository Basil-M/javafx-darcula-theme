import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

/**
 * Created by zhao_zh on 10/26/2016.
 */
public class Manager {
    private final Stage stage;

    Manager(Stage stage) {
        this.stage = stage;
    }

    void doLogin(String sessionID) {
        showMainScene(sessionID);
    }

    void doLogout() {
        showLoginScene();
    }

    private void showLoginScene() {
        URL url = getClass().getResource("layout/login.fxml");
        FXMLLoader loader = new FXMLLoader(url);

        try {
            BorderPane root = (BorderPane) loader.load();
            stage.setTitle("COMPANY Login");
            stage.setScene(new Scene(root));

            LoginController loginController = loader.<LoginController>getController();
            loginController.initializeAction(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showMainScene(String sessionID) {
        URL url = getClass().getResource("layout/main.fxml");
        FXMLLoader loader = new FXMLLoader(url);

        try {
            Parent root = loader.load();
            stage.setScene(new Scene(root));
            MainController mainController = loader.<MainController>getController();
            mainController.initializeFont();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
