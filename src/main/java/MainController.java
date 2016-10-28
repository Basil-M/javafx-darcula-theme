import de.jensd.fx.glyphs.GlyphIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import de.jensd.fx.glyphs.fontawesome.utils.FontAwesomeIconFactory;
import javafx.fxml.FXML;
import javafx.scene.control.TreeView;
import de.jensd.fx.glyphs.GlyphsStyle;
import javafx.scene.layout.FlowPane;

/**
 * Created by zhao_zh on 10/26/2016.
 */
public class MainController {

    @FXML
    private FlowPane icon_pane;

    void initializeFont (){

            icon_pane.getChildren().add(FontAwesomeIconFactory.get().createIcon(FontAwesomeIcon.SEARCH_MINUS, "1em"));
    }


}
