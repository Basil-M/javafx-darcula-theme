package controller;

import controller.LoginController;
import controller.MainController;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.URL;

/**
 * Created by zhao_zh on 10/26/2016.
 */

@Slf4j
public class Manager {
    private final Stage stage;

    public double init_x;
    public double init_y;

    double getX(){
        return stage.getX();
    }

    void setX(double x) {
        stage.setX(x);
    }

    double getY() {
        return stage.getY();
    }

    void setY(double y) {
        stage.setY(y);
    }

    public Manager(Stage stage) {
        this.stage = stage;
    }

    public void doLogin(String sessionID) {
        showMainScene(sessionID);
    }

    public void doLogout() {
        showLoginScene();
    }

    private void showLoginScene() {
        URL url = getClass().getResource("../layout/login.fxml");
        FXMLLoader loader = new FXMLLoader(url);

        try {
            BorderPane root = (BorderPane) loader.load();
            stage.setTitle("COMPANY Login");
            stage.setScene(new Scene(root));
            stage.initStyle(StageStyle.UNDECORATED);


            LoginController loginController = loader.<LoginController>getController();
            loginController.initializeAction(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showMainScene(String sessionID) {
        URL url = getClass().getResource("../layout/main.fxml");
        FXMLLoader loader = new FXMLLoader(url);


        try {
            Parent root = loader.load();
            stage.setScene(new Scene(root));

            Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
            stage.setX(0.0);
            stage.setY(0.0);
            log.info("screen width = {}, screed height = {}", screenBounds.getWidth(), screenBounds.getHeight());
            stage.setWidth(screenBounds.getWidth());
            stage.setHeight(screenBounds.getHeight());

            MainController mainController = loader.<MainController>getController();
            mainController.initializeAction(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void close() {
        stage.close();
    }


}
