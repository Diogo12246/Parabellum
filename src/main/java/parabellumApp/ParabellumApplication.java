package parabellumApp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class ParabellumApplication extends Application {

    public static Stage stage;
    private Scene scene;
    private AnchorPane page;
    private Screen ecra = Screen.getPrimary();
    private Rectangle2D window = ecra.getVisualBounds();

    public static void main(String[] args) {
        ParabellumMenu.launch(ParabellumApplication.class, (java.lang.String[]) null);
    }

    @Override
    public void start(Stage stage){
        try {
            ParabellumApplication.stage= stage;
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("FXML/ParabellumApp.fxml"));
            scene = new Scene(root);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setX(window.getMinX());
            stage.setY(window.getMinY());
            stage.setWidth(window.getWidth());
            stage.setHeight(window.getHeight());
            stage.setScene(scene);
            stage.show();

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
