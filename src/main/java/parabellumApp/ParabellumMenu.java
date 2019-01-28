package parabellumApp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class ParabellumMenu extends Application {

    public static Stage stage;
    private Scene scene;
    private Screen ecra = Screen.getPrimary();
    private Rectangle2D window = ecra.getVisualBounds();
    private double x, y;

    public static void main(String[] args) {
        ParabellumMenu.launch(ParabellumMenu.class, (java.lang.String[]) null);
    }


    @Override
    public void start(Stage stage) {

        try {
            ParabellumMenu.stage = stage;
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("FXML/ParabellumMenu.fxml"));
            scene = new Scene(root);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            root.setOnMousePressed(event -> {
                x = event.getSceneX();
                y = event.getSceneY();
            });
            root.setOnMouseDragged(event -> {

                stage.setX(event.getScreenX() - x);
                stage.setY(event.getScreenY() - y);

            });
            stage.show();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}

