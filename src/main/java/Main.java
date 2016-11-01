import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    private String username = "zzl";
    private String password = "asd123";
    private String m_username = "";
    private String m_password = "";
    private Stage primaryStage;
    private BorderPane root_layout;
    private String my_css = getClass().getClassLoader().getResource("css/mystyle.css").toExternalForm();

    @Override
    public void start(Stage primaryStage) throws Exception{
        Manager manager = new Manager(primaryStage);
        manager.doLogout();
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
