package controller;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

/**
 * Created by zhao_zh on 10/26/2016.
 */
public class MainController {
//
    @FXML
    private ImageView close;
    @FXML
    private HBox topbar;

    void initializeAction (final Manager manager){
        close.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                manager.close();
            }
        });

        topbar.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                manager.init_x = manager.getX() - event.getScreenX();
                manager.init_y = manager.getY() - event.getScreenY();
            }
        });

        topbar.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                manager.setX(event.getScreenX() + manager.init_x);
                manager.setY(event.getScreenY() + manager.init_y);
            }
        });
    }


}
